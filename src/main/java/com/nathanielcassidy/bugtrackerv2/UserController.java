package com.nathanielcassidy.bugtrackerv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        int intId = Integer.parseInt(id);
        return userService.getUser(intId);
    }

    @RequestMapping("/users")
    public ArrayList<User> getListOfUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(method= RequestMethod.POST, value="/users")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
    public void deleteUser(@PathVariable String id) {
        int intId = Integer.parseInt(id);
        userService.deleteUser(intId);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
    public void updateUser(@RequestBody User user) {
        userService.changeUser(user);
    }
}
