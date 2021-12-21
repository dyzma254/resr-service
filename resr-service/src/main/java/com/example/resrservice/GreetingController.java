package com.example.resrservice;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    /*

        w requescie powinny byc 2 stringi, ktore nalezy dodac do siebie, zwrocic do klienta jako jeden oraz godzine jako dodatkowe pole
        kamil@biernat@globallogic.com do 21.12.21
     */

    @PostMapping("/greeting")
    public TODO postGreeting(@RequestBody ObjectNode jsonNodes) {
        String strOne = jsonNodes.get("string1").asText();
        String strTwo = jsonNodes.get("string2").asText();
        return new TODO("xd", LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute());
    }

}