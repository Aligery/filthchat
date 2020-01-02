package ru.shitandsticks.filthchat.mappers;


import org.apache.ibatis.annotations.Param;
import ru.shitandsticks.filthchat.data.AuthUser;
import org.apache.ibatis.annotations.Mapper;
import ru.shitandsticks.filthchat.data.User;

import java.util.List;

@Mapper
public interface UsersMapper {

    List<AuthUser> listAuthUser();

    void registerNewUser(@Param("obj") User user);

    AuthUser loginUser(@Param("obj") User user);

}
