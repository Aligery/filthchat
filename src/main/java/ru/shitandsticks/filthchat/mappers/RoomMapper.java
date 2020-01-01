package ru.shitandsticks.filthchat.mappers;

import org.apache.ibatis.annotations.Mapper;
import ru.shitandsticks.filthchat.data.Room;

import java.util.List;

@Mapper
public interface RoomMapper {

    public List<Room> list();
}
