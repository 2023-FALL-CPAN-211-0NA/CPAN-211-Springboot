package org.humber.dsa.events;

import org.springframework.context.ApplicationEvent;


public class UserEvent extends ApplicationEvent {

    private final String username;

    public UserEvent(Object source, String username) {
        super(source);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

/* You can rewrite the above code as below

import lombok.Getter;

@Getter
public class UserEvent {

    private final String name;


    public UserEvent(String name) {
        this.name = name;
    }
}
*/
