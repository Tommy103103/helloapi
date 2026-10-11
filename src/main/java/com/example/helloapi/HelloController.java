
package com.example.helloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public Map<String, String> hello(
            @RequestParam(defaultValue = "World") String name,
            @RequestParam(defaultValue = "1") String language) {

        String greeting;

        if (language.equals("ja")) {
            greeting = "こんにちは、" + name + "さん！";
        } else {
            greeting = "Hello," + name + "!";
        }

        return Map.of("message", greeting);
    }
}
