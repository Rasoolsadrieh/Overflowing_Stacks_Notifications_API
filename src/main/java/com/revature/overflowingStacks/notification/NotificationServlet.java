package com.revature.overflowingStacks.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NotificationServlet {

    private final NotificationServices notificationServices;

    @Autowired
    public NotificationServlet(NotificationServices notificationServices){
        this.notificationServices = notificationServices;
    }
}
