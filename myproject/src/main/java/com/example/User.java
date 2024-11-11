package com.example;

public class User {

private String username;
private String password;
private int age;
private Boolean loginStatus;

public User(String username, String password, int age) {
    if (age < 18) {
        throw new IllegalArgumentException("Minimum age: 18 required for registration.");
    }
    this.username = username;
    this.password = password;
    this.age = age;
    this.loginStatus = false;

    System.out.println("User: " + this.username + " created successfully" );
}

public String getUsername() {
    return username;
}

public String getPassword() {
    return password;
}

public int getAge() {
    return age;
}

public Boolean getloginStatus() {
    return loginStatus;
}

public void setLoginStatus() {
    if (this.loginStatus.equals(true)) {
        this.loginStatus = false;
    }
    else {
        this.loginStatus = true;
    }
}
}
