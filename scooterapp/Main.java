package scooterapp;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        app1.registerUser("Ant1", "password1", 22);
        app1.createScooter("Kings Cross");
        app1.createScooter("Euston");
        app1.createScooter("Kings Cross");
        System.out.println(app1.registeredUsers);
        System.out.println(app1.stations);

    }
}
