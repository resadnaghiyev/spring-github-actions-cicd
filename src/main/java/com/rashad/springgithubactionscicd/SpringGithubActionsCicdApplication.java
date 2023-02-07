package com.rashad.springgithubactionscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringGithubActionsCicdApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to github actions CI/CD";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringGithubActionsCicdApplication.class, args);
    }

}
