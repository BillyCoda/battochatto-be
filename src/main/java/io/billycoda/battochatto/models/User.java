package io.billycoda.battochatto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Document(collection = "users")
public class User {

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
}
