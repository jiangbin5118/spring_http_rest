package com.rest.exception;

/**
 * @author <a href="mailto:lanhuai@gmail.com">Ning Yubin</a>
 * @version $Id$
 */
public class SurDocAPIException extends RuntimeException implements ErrorCodeException {
    private static final long serialVersionUID = -1665379208235807889L;

    private Integer errorCode;

    public SurDocAPIException(String message) {
        super(message);
    }

    public SurDocAPIException(String message, Integer errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public SurDocAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public SurDocAPIException(String message, Integer errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}
