package scooterapp;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        User user1 = new User("Ant1", "password1", 19);
        User user2 = new User("Ant2", "password2", 15);
        user1.login("password1");
        user1.logout();
        System.out.println(app1.registeredUsers);

    }
}
