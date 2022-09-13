package se.aman;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {

    private String message;
    private String userId;
    private boolean readReceiptEnabled;
    private LocalDateTime added;

    public Message(String message, String userId, boolean readReceiptEnabled, LocalDateTime added) {
        this.message = message;
        this.userId = userId;
        this.readReceiptEnabled = readReceiptEnabled;
        this.added = added;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isReadReceiptEnabled() {
        return readReceiptEnabled;
    }

    public void setReadReceiptEnabled(boolean readReceiptEnabled) {
        this.readReceiptEnabled = readReceiptEnabled;
    }

    public LocalDateTime getAdded() {
        return added;
    }

    public void setAdded(LocalDateTime added) {
        this.added = added;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return isReadReceiptEnabled() == message1.isReadReceiptEnabled() && Objects.equals(getMessage(), message1.getMessage()) && Objects.equals(getUserId(), message1.getUserId()) && Objects.equals(getAdded(), message1.getAdded());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getUserId(), isReadReceiptEnabled(), getAdded());
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", userId='" + userId + '\'' +
                ", readReceiptEnabled=" + readReceiptEnabled +
                ", added=" + added +
                '}';
    }
}
