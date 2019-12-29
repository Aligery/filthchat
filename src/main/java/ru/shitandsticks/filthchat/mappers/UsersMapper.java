package ru.shitandsticks.filthchat.mappers;


import ru.shitandsticks.filthchat.data.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {


    public Integer getUserById(User user);

}
