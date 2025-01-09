package com.library.model;

public abstract class User {

    private int userId;
    private String userName;

    // Methods
    public abstract void addUser();
    public abstract void removeUser();
    public abstract void updateUser();
    public abstract void searchUser();

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void displayUserDetails(User user) {
        System.out.println("User ID: " + user.getUserId());
        System.out.println("User Name: " + user.getUserName());
    }

}
