package io.billycoda.battochatto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "channels")
public class Channel {

    // Fields
    @Id
    private String id;
    private String name;
    private int capacity;
    private boolean privacy;
    private String topic;

    // Constructors
    public Channel() {
    }

    public Channel(String id, String name, int capacity, boolean privacy, String topic) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.privacy = privacy;
        this.topic = topic;
    }

    public Channel(String name, int capacity, boolean privacy, String topic) {
        this.name = name;
        this.capacity = capacity;
        this.privacy = privacy;
        this.topic = topic;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isPrivacy() {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
