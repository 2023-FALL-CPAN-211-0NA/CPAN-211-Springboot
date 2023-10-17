package org.humber.dsa.listeners;

import lombok.extern.slf4j.Slf4j;
import org.humber.dsa.events.UserEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserEventListener implements ApplicationListener<UserEvent> {

    @Override
    @Async // Remove Async for execution in the same thread
    public void onApplicationEvent(UserEvent event) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String username = event.getUsername();
        log.info("User event received | name: " + username + " | Thread=" + Thread.currentThread().getName());
    }
}

/* You can re-write the above code in following fashion (async):

@Component
@Slf4j
public class UserEventListener {

    @Async
    @EventListener
    public void onApplicationEvent(UserEvent event) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Event Received user name=" + event.getName());
    }
}

 */
