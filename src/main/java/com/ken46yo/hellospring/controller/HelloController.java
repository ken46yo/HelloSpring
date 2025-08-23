package com.ken46yo.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("This is my first Spring Boot application!");
    }

    // レスポンス用クラス
    static class HelloResponse {
        private String message;

        public HelloResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}