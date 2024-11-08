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
    App.registeredUsers.add(this);
    System.out.println("User: " + this.username + " created successfully" );
}

public String getUsername() {
    return username;
}

public String getPassword() {
    return password;
}

public Boolean getloginStatus() {
    return loginStatus;
}

public int getAge() {
    return age;
}

}
