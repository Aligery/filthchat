package ru.shitandsticks.filthchat.data;

public class Room {

    private int roomId;
    private String theme_room;
    private String anti_theme_room;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getTheme_room() {
        return theme_room;
    }

    public void setTheme_room(String theme_room) {
        this.theme_room = theme_room;
    }

    public String getAnti_theme_room() {
        return anti_theme_room;
    }

    public void setAnti_theme_room(String anti_theme_room) {
        this.anti_theme_room = anti_theme_room;
    }
}
