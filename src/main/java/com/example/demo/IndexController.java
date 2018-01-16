package com.example.demo;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	 @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping("/")
	    public String greeting(Principal principal, @RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        System.out.println("==== in greeting ==== index");
	        String foo = "foobaroo";
	        model.addAttribute("foo", foo);
	        
	        Authentication authentication = (Authentication) principal;
	 	   if( authentication != null && authentication.isAuthenticated()) {
	 		   User u  = (User) authentication.getPrincipal();
	 		   model.addAttribute("foo", u.getUsername());
	 	   }
	 	   
	 	   else {
	 		   
	 		   System.out.println("User is null");
	 		   model.addAttribute("foo", "NO USER");
	 	   }
	 	   
	        return "index";
	    }
	 

}
