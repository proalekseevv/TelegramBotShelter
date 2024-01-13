package com.example.nurserypetbot.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "notification_task")
public class Notification {

    @Column(name = "chat_id")
    @Id
    @GeneratedValue
    private Long chatId;

    @Column(name = "message")
    public String message;
    @Column(name = "message_time")
    public LocalDateTime timeAndDate;

    public Notification(Long chatId, String message, LocalDateTime timeAndDate) {
        this.chatId = chatId;
        this.message = message;
        this.timeAndDate = timeAndDate;
    }

    public Notification() {
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "chatId=" + chatId +
                ", message='" + message + '\'' +
                ", timeAndDate=" + timeAndDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notification)) return false;
        Notification that = (Notification) o;
        return Objects.equals(chatId, that.chatId) && Objects.equals(message, that.message) && Objects.equals(timeAndDate, that.timeAndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, message, timeAndDate);
    }
}
