package com.github.user888mk;

import java.util.Optional;

class HelloService {
    static final String FALLBACK_NAME = "world";

    String prepareGreeting(String name) {
        return "Hello" + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
    }
}