public class SvoiException extends Exception {
    public SvoiException() {
    }

    public SvoiException(String message) {
        super(message);
    }

    public SvoiException(String message, Throwable cause) {
        super(message, cause);
    }

    public SvoiException(Throwable cause) {
        super(cause);
    }

    public SvoiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
