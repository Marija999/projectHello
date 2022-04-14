package com.example.helloProject.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }
    @RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable String id, @RequestBody Users user) {

        userService.updateUser(id, user);
    }
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }


}
