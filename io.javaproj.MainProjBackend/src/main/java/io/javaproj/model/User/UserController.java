package io.javaproj.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public void registerUser(String username,String password){
        User user = new User(username,password);
        userService.registerUser(user);
    }
    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        if(user.equals(null)) return null;
        return  user;
    }

}
