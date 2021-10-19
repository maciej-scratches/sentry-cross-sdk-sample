package com.example.ratingservice;

import io.sentry.spring.tracing.SentrySpan;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@SentrySpan
public class HelloService {

    private final Random random = new Random();

    String hello() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
        return "hello from java";
    }
}
