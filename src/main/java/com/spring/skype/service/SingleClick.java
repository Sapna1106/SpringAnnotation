package com.spring.skype.service;

import org.springframework.stereotype.Component;

@Component
public class SingleClick implements OnClick{

	@Override
	public String getAction() {
		return "Open Chat";
	}

}
