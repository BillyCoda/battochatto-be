package io.billycoda.battochatto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Document(collection = "users")
public class User {

    // Fields
    @Id
    private String id;
    private String name;
    private String username;
    private String password;
    private Object[] settings;
    private Image profileImage;
    private String[] channels;
    private String[] friends;
    private String[] pendingFriends;

    // Constructors
    public User() {
    }

    public User(String id, String name, String username, String password, Object[] settings, Image profileImage, String[] channels, String[] friends, String[] pendingFriends) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.settings = settings;
        this.profileImage = profileImage;
        this.channels = channels;
        this.friends = friends;
        this.pendingFriends = pendingFriends;
    }

    public User(String name, String username, String password, Object[] settings, Image profileImage, String[] channels, String[] friends, String[] pendingFriends) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.settings = settings;
        this.profileImage = profileImage;
        this.channels = channels;
        this.friends = friends;
        this.pendingFriends = pendingFriends;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object[] getSettings() {
        return settings;
    }

    public void setSettings(Object[] settings) {
        this.settings = settings;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

    public String[] getChannels() {
        return channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String[] getPendingFriends() {
        return pendingFriends;
    }

    public void setPendingFriends(String[] pendingFriends) {
        this.pendingFriends = pendingFriends;
    }
}
