package scooterapp;

public class Main {
    public static void main(String[] args) {
        App app1 = new App();
        app1.registerUser("Ant1", "password1", 22);
        app1.createScooter("Kings Cross");
        app1.createScooter("Euston");
        app1.createScooter("Kings Cross");
        app1.createScooter("St Pancras");
        app1.loginUser("Ant1", "password1");
        


        app1.logoutUser("Ant1");
    }
}
