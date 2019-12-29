package ru.shitandsticks.filthchat.service;

import ru.shitandsticks.filthchat.data.User;
import ru.shitandsticks.filthchat.mappers.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersMapper usersMapper;


    public Integer getIdUserFromDb(User user) {
        Integer idUser = usersMapper.getUserById(user);
        if (idUser != null && idUser > 0) {
            return idUser;
        } else {
            return 0; //0 user doesn't found
        }
    }
}
