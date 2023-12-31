package br.com.fiap;

public class Message {

    private String role;

    private String content;

    public Message() {
    }

    public Message(String role, String content) {
        this.role = role;

        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public Message setRole(String role) {
        this.role = role;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }


    @Override
    public String toString() {
        return "Message{" +
                "role='" + role + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
