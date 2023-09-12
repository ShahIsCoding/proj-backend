package io.javaproj.model.User;

import io.javaproj.Constants.Const;
import org.springframework.data.annotation.Id;

import java.util.UUID;
public class User {
    @Id
    private String id;
    private String username;
    private String password;

    public User() {}

    public User(String username, String password) {
        setId(Const.USER+ ":"+UUID.randomUUID().toString());
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
