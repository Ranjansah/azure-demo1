package com.test.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/hi")
	public String hi()
	{
		return "Hey This is a Demo for Azure";
	}

}
