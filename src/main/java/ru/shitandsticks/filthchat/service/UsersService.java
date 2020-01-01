package ru.shitandsticks.filthchat.service;

import ru.shitandsticks.filthchat.data.AuthUser;
import ru.shitandsticks.filthchat.mappers.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public List<AuthUser> listAuthUser() {
        return usersMapper.listAuthUser();
    }

}
