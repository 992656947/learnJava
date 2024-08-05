package chapter09_1.src.com.ex2;

public class CourseNameErrException extends Exception {
    public CourseNameErrException() {
    }

    public CourseNameErrException(String message) {
        super(message);
    }

    public CourseNameErrException(String message, Throwable cause) {
        super(message, cause);
    }

    public CourseNameErrException(Throwable cause) {
        super(cause);
    }

    public CourseNameErrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
