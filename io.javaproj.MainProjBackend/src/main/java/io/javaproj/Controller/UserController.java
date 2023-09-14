package io.javaproj.Controller;

import io.javaproj.Services.UserServices;
import io.javaproj.model.User.User;
import io.javaproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;
    @PostMapping("/register")
    public String registerUser(@RequestBody User userpayload){
        User user = new User(userpayload.getUsername(),userpayload.getPassword());
        userServices.registerUser(user);
        return user.getId();
    }
    @GetMapping("/all")
    public List<User> getUsers(){
        return userServices.getAllUsers();
    }
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") String userId){
        User user = userServices.getUser(userId);
        return  user.toString();
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") String userId){
        userServices.deleteUser(userId);
        return "deleted the user";
    }
}