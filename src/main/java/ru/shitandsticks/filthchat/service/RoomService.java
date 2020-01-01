package ru.shitandsticks.filthchat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shitandsticks.filthchat.data.Room;
import ru.shitandsticks.filthchat.mappers.RoomMapper;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomMapper roomMapper;

    public List<Room> listRooms(){
        return roomMapper.list();
    }


}
