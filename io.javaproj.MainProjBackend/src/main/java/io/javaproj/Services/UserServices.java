package io.javaproj.Services;

import io.javaproj.model.User.User;
import io.javaproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
    @Autowired
    private UserRepository userRepo;
    public void registerUser(User user){
        userRepo.save(user);
    }

    public User getUser(String userId) {
        return userRepo.findById(userId).get();
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    public void deleteUser(String userId){
        userRepo.deleteById(userId);
    }
}
