package org.humber.dsa.controllers;

import org.humber.dsa.publishers.UserEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEventController {

    private final UserEventPublisher userEventPublisher;


    public UserEventController(UserEventPublisher userEventPublisher) {
        this.userEventPublisher = userEventPublisher;
    }

    @GetMapping("/user/{name}")
    public String userEvent(@PathVariable("name") String name) {
        userEventPublisher.publishUserEvent(name);
        return "SUCCESS";
    }
}
