package com.spring.skype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.skype.service.OnClick;

@Component("action")
public class ActionController {
	private OnClick onClick;
	
	@Autowired
	public ActionController(@Qualifier("singleClick") OnClick onClick) {
		this.onClick=onClick;
	}
	
	public String getAction() {
		return onClick.getAction();
	}

}
