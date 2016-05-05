package com.rest.view;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView {
	
	private static final int DEFAULT_BUFFER_SIZE = 10240;

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
		response.setHeader("Content-Disposition",
				"attachment;filename=jiangbin.txt");

		InputStream input = null;
		OutputStream output = null;
		try {
			input = new BufferedInputStream(new ByteArrayInputStream(
					"jiangbin".getBytes()));
			output = response.getOutputStream();
			copy(input, output);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			close(input);
			close(output);
		}
	}

	private static void copy(InputStream input, OutputStream output)
			throws IOException {
		// Write full range.
		byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
		int read;
		while ((read = input.read(buffer)) != -1) {
			output.write(buffer, 0, read);
			output.flush();
		}
	}

	private static void close(Closeable resource) {
		if (resource != null) {
			try {
				resource.close();
			} catch (IOException ignore) {
			}
		}
	}

}
