package com.spring.skype.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OnHold implements OnClick{

	@Override
	public String getAction() {
		
		return "Calling";
	}

}
