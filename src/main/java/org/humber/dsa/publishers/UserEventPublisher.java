package org.humber.dsa.publishers;

import lombok.extern.slf4j.Slf4j;
import org.humber.dsa.events.UserEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public UserEventPublisher(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publishUserEvent(String username) {
        UserEvent registrationEvent = new UserEvent(this, username);
        log.info("Current Thread=" + Thread.currentThread().getName());
        eventPublisher.publishEvent(registrationEvent);
    }
}
