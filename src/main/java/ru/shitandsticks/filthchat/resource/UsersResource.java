package ru.shitandsticks.filthchat.resource;

import ru.shitandsticks.filthchat.data.User;
import ru.shitandsticks.filthchat.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class UsersResource {

    @Autowired
    UsersService userService;

    @PostMapping("/login")
    public ResponseEntity getUserId(User user) {
        return ResponseEntity.ok(userService.getIdUserFromDb(user));
    }

}
