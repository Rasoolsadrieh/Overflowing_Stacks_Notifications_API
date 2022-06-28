package com.revature.overflowingStacks.user;

import com.revature.overflowingStacks.util.interfaces.Serviceable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServices implements Serviceable<User> {
    @Override
    public User create(User newObject) {
        return null;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public User readById(String id) {
        return null;
    }

    @Override
    public User update(User updatedObject) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean validateInput(User object) {
        return false;
    }

    public User authenticateUser(String username, String password) { return null;
    }
}
