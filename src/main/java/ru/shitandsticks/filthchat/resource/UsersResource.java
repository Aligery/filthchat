package ru.shitandsticks.filthchat.resource;

import org.springframework.web.bind.annotation.*;
import ru.shitandsticks.filthchat.data.User;
import ru.shitandsticks.filthchat.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("users")
public class UsersResource {

    @Autowired
    UsersService userService;

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity getUserId(User user) {
        return ResponseEntity.ok(userService.loginUser(user));
    }

    @PutMapping(value = "/register", produces = "application/json")
    public ResponseEntity regUser(User user) {
        userService.registerNewUser(user);
        return ResponseEntity.ok(user.getUsername());
    }

    @GetMapping(value = "/list", produces = "application/json")
    public ResponseEntity listUser() {
        return ResponseEntity.ok(userService.listAuthUser());
    }

}
