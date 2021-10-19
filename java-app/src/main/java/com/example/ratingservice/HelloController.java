package com.example.ratingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
class HelloController {
    private final Random random = new Random();
    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    String hello() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
        return helloService.hello();
    }

}
