package com.springapp.instazoo.payload.response;

public class InvalidLoginResponse {
    public String username;
    public String password;

    public InvalidLoginResponse() {
        this.username="Invalid Username";
        this.password="Invalid Password";
    }
}
