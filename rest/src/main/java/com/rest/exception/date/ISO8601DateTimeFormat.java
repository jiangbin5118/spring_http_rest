package com.rest.exception.date;

import org.codehaus.jackson.map.util.ISO8601DateFormat;
import org.codehaus.jackson.map.util.ISO8601Utils;

import java.text.FieldPosition;
import java.util.Date;

/**
 * @author <a href="mailto:lanhuai@gmail.com">Ning Yubin</a>
 * @version $Id$
 */
public class ISO8601DateTimeFormat extends ISO8601DateFormat {
	
	private static final long serialVersionUID = 2442328531074042685L;

	@Override
	public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
		String value = ISO8601Utils.format(date, true);
		toAppendTo.append(value);
		return toAppendTo;
	}
	
}
