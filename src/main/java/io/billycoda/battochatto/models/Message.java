package io.billycoda.battochatto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "messages")
public class Message {

    // Fields
    @Id
    private String id;
    private String userId;
    private String channelId;
    private String messageContent;
    private Date timestamp;

    // Constructors
    public Message() {
    }

    public Message(String id, String userId, String channelId, String messageContent, Date timestamp) {
        this.id = id;
        this.userId = userId;
        this.channelId = channelId;
        this.messageContent = messageContent;
        this.timestamp = timestamp;
    }

    public Message(String userId, String channelId, String messageContent, Date timestamp) {
        this.userId = userId;
        this.channelId = channelId;
        this.messageContent = messageContent;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
