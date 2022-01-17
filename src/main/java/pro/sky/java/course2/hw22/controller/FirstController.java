package pro.sky.java.course2.hw22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw22.service.CountService;

@RestController
public class FirstController {

    private final CountService countService;

    public FirstController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping
    public String sayHello() {
        return "Hello, world!";
    }

    @GetMapping("/counter")
    public String showCounter() {
        return "Количество запросов " + countService.getRequestCount();
    }

    @GetMapping("/greetings")
    public String showGreetings(@RequestParam String name,
                                @RequestParam String lastName) {
        return "Hello, " + lastName + " " + name + "!";
    }
}
