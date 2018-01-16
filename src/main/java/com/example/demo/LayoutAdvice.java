package com.example.demo;

import java.security.Principal;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.samskivert.mustache.Mustache.Compiler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

import com.samskivert.mustache.Mustache;

import com.example.demo.Layout;

@ControllerAdvice
class LayoutAdvice {
	private static final Logger log = LoggerFactory.getLogger(LayoutAdvice.class);
	
	private final Compiler compiler;

	@Autowired
	public LayoutAdvice(Compiler compiler) {
		this.compiler = compiler;
	}

	@ModelAttribute("layout")
	public Mustache.Lambda layout(Map<String, Object> model) {
		return new Layout(compiler);
	}
	
	@ModelAttribute("foo2")
	public String fooString(Map<String, Object> model) {
		System.out.println(model.keySet());
		return "Foo2";
	}
	
	@ModelAttribute("myuser")
	public User userObject(Map<String, Object> model, Principal principal) {
		
		Authentication authentication = (Authentication) principal;
		   if( authentication != null && authentication.isAuthenticated()) {
			   
			   log.info("is authenticated");
			   System.out.println("is authenticated");
			   User u  = (User) authentication.getPrincipal();
			   return u;
		   }
		   return null;
	}
}

