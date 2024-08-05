package chapter11.src.com.njwb.sys.newClass.util.ex;

public class DateConvertException extends RuntimeException  {

    public DateConvertException() {
    }

    public DateConvertException(String message) {
        super(message);
    }

    public DateConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    public DateConvertException(Throwable cause) {
        super(cause);
    }

    public DateConvertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
