package demo.springboot;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 了解SecurityManager和Subject的使用
 * Created by zhaolu on 2018/4/17.
 */
public class ShiroTutorial {

    private static final transient Logger log = LoggerFactory.getLogger(ShiroTutorial.class);

    public static void main(String[] args)
    {
        log.info("My First Apache Shiro Application");
        //使用IniSecurityManager提取shiro.ini文件
        Factory<SecurityManager>  factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //返回securityManager实例
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //获得当前执行的用户
        Subject currentUser = SecurityUtils.getSubject();
        //获得用户的会话
        Session session = currentUser.getSession();
        session.setAttribute("someKey","aValue");
        String value = (String)session.getAttribute("someKey");
        if(value.equals("aValue"))
        {
            log.info("Retrieved the correct vlaue! [" + value + "]");
        }
        //检查当前用户的权限，直到至少登录一次
        if(!currentUser.isAuthenticated())
        {
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr","vespa");
            token.setRememberMe(true);
            try{
                currentUser.login(token);
            }catch (UnknownAccountException uae)
            {
                log.info("\"There is no user with username of \" + token.getPrincipal()");
            }catch (IncorrectCredentialsException ice)
            {
                log.info("Password for account " + token.getPrincipal() + " was incorrect!");
            }catch (LockedAccountException iae)
            {
                log.info("The account for username " + token.getPrincipal() + " is locked. " + "Please contact your administrator to unlock it.");
            }
            catch (AuthenticationException ae)
            {
                log.info("unexpected condition? error?");
            }
        }
        log.info("User [" + currentUser.getPrincipal() + "] logged in successfully.");
        //测试用户的角色
        if(currentUser.hasRole("schwartz"))
        {
            log.info("May the Schwartz be with you!");
        }else
        {
            log.info("Hello, mere mortal.");
        }
        //测试权限
        if(currentUser.isPermitted("lightsaber:weild"))
        {
            log.info("You may use a lightsaber ring. Use it wisely.");
        }else
        {
            log.info("Sorry, lightsaber rings are for schwartz masters only.");
        }
        if (currentUser.isPermitted("winnebago:drive:eagle5")) {
            log.info("You are permitted to 'drive' the winnebago with license plate (id) 'eagle5' . "+"Here are the keys - have fun!");
        } else {
            log.info("Sorry, you aren't allowed to drive the 'eagle5' winnebago!");
        }
        currentUser.logout();
        System.exit(0);
    }
}
