package com.zhiyou100.dumplings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DumplingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DumplingsApplication.class, args);
    }
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
