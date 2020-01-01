package ru.shitandsticks.filthchat.mappers;


import ru.shitandsticks.filthchat.data.AuthUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    public List<AuthUser> listAuthUser();

}
