package com.mdsd.hotel.presentation.model;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class UserAccount {

    private final String id;
    private final String username;
    private final String password;
    private final UserGroup userGroup;

    public UserAccount() {
        this.id = null;
        this.username = null;
        this.password = null;
        this.userGroup = null;
    }

    public UserAccount(String id, String username, String password, UserGroup userGroup) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }
}
