package com.ntsGroup.springboot.firstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

//url hit and back the string ----- 
	
	@RequestMapping("say-hello") //without responsebody it is searching for jsp name same as return string
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you doing ?";
	}
	
	
	// here we can use html as string
//	@RequestMapping("say-hello-html") 
//	@ResponseBody
//	public String sayHelloHtml() {
//		
//	}
	
	
	//JSP ---> Java server Pages
	
	@RequestMapping("say-hello-jsp") 
	public String sayHelloJsp() {
		return "sayHello";
	}
}
