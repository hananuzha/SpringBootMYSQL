package com.genspark.demo.Controller;

import com.genspark.demo.Entity.User;
import com.genspark.demo.Service.UserServiceImpl;
import com.genspark.demo.ServiceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/User")
    public List<User> getUsers(){
        return this.userService.getAllUser();
    }

    @GetMapping("/getUserById/{UserId}")
    public User getUser(@PathVariable("UserId") int id){
        return (this.userService.getUserById(id));
    }

    @GetMapping("/getUserByEmail/{email}")
    public User getUserLikeEmail(@PathVariable("email") String email){
        return (this.userService.getUserLikeEmail(email));
    }

    @PostMapping("/User")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }
    @PutMapping("/User")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }
    @DeleteMapping(path="/User/{id}")
    public String deleteUser(@PathVariable("id") int id){
        return this.userService.deleteUser(id);
    }


}
