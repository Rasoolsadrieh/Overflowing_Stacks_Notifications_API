package com.revature.overflowingStacks.notification;

import com.revature.overflowingStacks.user.User;
import com.revature.overflowingStacks.user.UserDao;
import com.revature.overflowingStacks.util.interfaces.Serviceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NotificationServices implements Serviceable<Notification> {

    private final NotificationDao notificationDao;
    private final UserDao userDao;

    @Autowired
    public NotificationServices(NotificationDao notificationDao, UserDao userDao) {
        this.notificationDao = notificationDao;
        this.userDao = userDao;
    }

    @Override
    public Notification create(Notification newNotification){ return notificationDao.save(newNotification);}

    @Override
    public Notification update(Notification updatedNotification) { return null;}

    @Override
    public Notification readById(String movieId) {return null;}

    public List<Notification> readByEmail(User email) {return notificationDao.notificationHistory(email);}

    @Override
    public boolean delete(String notiId) {
        notificationDao.deleteById(notiId);
        return true;
    }
}
