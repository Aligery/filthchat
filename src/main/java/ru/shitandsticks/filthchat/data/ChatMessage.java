package ru.shitandsticks.filthchat.data;

public class ChatMessage {

    private String content;
    private String login;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "content='" + content + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
