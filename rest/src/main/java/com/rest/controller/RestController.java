package com.rest.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.rest.exception.ResourceConflictException;
import com.rest.exception.model.ErrorCode;
import com.rest.view.DownloadView;

@Controller
public class RestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	@ResponseBody
	public User test() {
		User user = new User();
		user.setDataCenter("ningbo");
		user.setDataCenterName("ningbo_center");
		user.setPassWord("123456");
		user.setUserName("jiangbin");
		if (user.getUserName().equals("jiangbin"))
			throw new ResourceConflictException("file already exists", ErrorCode.FILE_CONFLICT);
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	@ResponseBody
    public User getUserById(@PathVariable String id) throws IOException {
		return new User();
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/name/{name}")
	@ResponseBody
    public User getUserByName(@PathVariable String name) throws IOException {
		throw new IOException();
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/code/{code}")
	@ResponseBody
    public User getUserByCode(@PathVariable int code) {
		throw new IllegalStateException("code not number");
    }
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/download")
	public View download(Model model) {
		return new DownloadView();
	}

}
