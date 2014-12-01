package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class UserAccount {

    private String username;
    private String password;
    private UserGroup userGroup;

    public UserAccount() {
    }

    protected UserAccount(String username, String password, UserGroup userGroup) {
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}
