package scooterapp;

public class User {

private String username;
private String password;
private int age;
private Boolean loginStatus;

public User(String username, String password, int age) {
    this.username = username;
    this.password = password;
    this.age = age;
    this.loginStatus = false;

    if (this.age < 17) {
        System.err.println("ERROR: Minimum age: 18");
    return;
    }
    App.registeredUsers.add(username);
    System.out.println("User: " + this.username + " created successfully" );
}

public void login(String password) {
    if (password.equals(this.password)) {
        this.loginStatus = true;
        System.out.println("User: " + this.username + " has logged in" );
    }
    else {
        System.err.println("ERROR: Incorrect password, try again");
        return;
    }
}

public void logout() {
    this.loginStatus = false;
    System.out.println("User: " + this.username + " has logged out" );
}

}
