package demo.springboot.result;

/**
 * Created by zhaolu on 2018/4/15.
 */
public class GlobalErrorInfoException extends Exception {

    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

}
