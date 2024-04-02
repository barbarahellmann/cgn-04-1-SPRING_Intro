package org.example.cgn041spring_intro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @GetMapping(path = "/world")
    public String helloWorld(){
        return "hello world";
    }
    
}
