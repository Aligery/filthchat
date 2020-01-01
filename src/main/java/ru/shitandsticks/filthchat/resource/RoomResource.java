package ru.shitandsticks.filthchat.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shitandsticks.filthchat.service.RoomService;

@RestController
@RequestMapping("rooms")
public class RoomResource {

    @Autowired
    private RoomService roomService;

    @GetMapping("/list")
    public ResponseEntity listRooms(){
        return ResponseEntity.ok(roomService.listRooms());
    }


}
