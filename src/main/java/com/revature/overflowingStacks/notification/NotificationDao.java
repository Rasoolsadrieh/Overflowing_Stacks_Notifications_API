package com.revature.overflowingStacks.notification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDao extends CrudRepository <Notification, String> {

}
