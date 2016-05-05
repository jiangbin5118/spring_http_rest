package com.rest.exception;

import com.rest.exception.model.ErrorCode;

/**
 * 资源冲突
 *
 * @author <a href="mailto:lanhuai@gmail.com">Ning Yubin</a>
 * @version $Id$
 */
public class ResourceConflictException extends SurDocAPIException {
	private static final long serialVersionUID = -5377795543808351116L;

	public ResourceConflictException(String message) {
		super(message, ErrorCode.RESOURCE_CONFLICT);
	}

    public ResourceConflictException(String message, int errorCode) {
        super(message, errorCode);
    }
}
