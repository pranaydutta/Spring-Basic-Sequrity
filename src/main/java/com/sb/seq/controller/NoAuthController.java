package com.sb.seq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {
	
	@GetMapping("/noAuth")
	public String welcome()
	{
		return "No Authentication";
	}

}
