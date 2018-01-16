package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	 @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping("/hello")
	    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
	        System.out.println("==== in greeting ==== index");
	        String foo = "foobaroo";
	        model.addAttribute("foo", foo);
	        return "hello";
	    }
}


