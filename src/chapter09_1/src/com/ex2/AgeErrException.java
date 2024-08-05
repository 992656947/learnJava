package chapter09_1.src.com.ex2;

public class AgeErrException extends Exception {
    public AgeErrException() {
        super();
    }

    public AgeErrException(String message) {
        super(message);
    }

    public AgeErrException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeErrException(Throwable cause) {
        super(cause);
    }

    protected AgeErrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
