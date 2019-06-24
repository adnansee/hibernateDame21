package ent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private int id;
    private String message;


    private LocalDateTime timeStampCreated;

    public Message() {
        timeStampCreated = LocalDateTime.now();
    }

    public LocalDateTime getTimeStampCreated() {
        return timeStampCreated;
    }

    public Message setTimeStampCreated(LocalDateTime timeStampSent) {
        this.timeStampCreated = timeStampSent;
        return this;
    }

    public int getId() {
        return id;
    }

    public Message setId(int id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public Message(String message) {
    }

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }
}
