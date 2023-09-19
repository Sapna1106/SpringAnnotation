package com.spring.skype.service;

import org.springframework.stereotype.Component;

@Component
public class DoubleClick implements OnClick{

	@Override
	public String getAction() {
		return "Emoji";
	}

}
