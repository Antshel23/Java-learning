package scooterapp;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        app1.registerUser("Ant1", "password1", 22);
        app1.createScooter("Kings Cross");
        app1.createScooter("Euston");
        app1.createScooter("Kings Cross");
        app1.createScooter("St Pancras");
        System.out.println(app1.stations);
        System.out.println(app1.scooters);
        app1.loginUser("Ant1", "password1");
        app1.rentScooter("St Pancras", "Ant1");
        System.out.println(app1.stations);
        app1.dockScooter("Euston", "Ant1");
        System.out.println(app1.stations);
        app1.logoutUser("Ant1");
    }
}