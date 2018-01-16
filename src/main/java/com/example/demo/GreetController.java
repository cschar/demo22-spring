
//@Controller
//public class GreetingController {
//
//    @RequestMapping("/greeting")
//    public String greetingMethod(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//
//        model.addAttribute("name", name);
//        return "mygreetingtemplate";
//    }
//
//}

package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping(path="/greet")
public class GreetController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/greeting")
    public String greeting(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return String.format(template, name);
    }
    
   
    //CORS set int Application.java here
    @GetMapping("/greeting-javaconfig")
    public String greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return String.format(template, name);
    }

}

