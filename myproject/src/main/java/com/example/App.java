package com.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class App {

static Map<String, List<Scooter>> stations;
static Map<Integer, Scooter> scooters;
static ArrayList<User> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", new ArrayList<>());
    stations.put("Euston", new ArrayList<>());
    stations.put("St Pancras", new ArrayList<>());
    registeredUsers = new ArrayList<User>();
    scooters = new HashMap<>();
    Scooter.nextSerial = 1;
}

public void registerUser(String username, String password, int age) {
    try {
        User newUser = new User(username, password, age);
        App.registeredUsers.add(newUser);
    }
    catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
        throw e;
    }
}

public void loginUser(String username, String password) {
    for (User user : registeredUsers) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getloginStatus() == false) {
            user.setLoginStatus();
            System.out.println(username + " has logged in");
        }
        else {
            throw new IllegalArgumentException("Login failed, please try again");
        }
    }
}

public void logoutUser(String username) {
for (User user : registeredUsers) {
    if (user.getUsername().equals(username) && user.getloginStatus() == true) {
        user.setLoginStatus();
        System.out.println(username + " has logged out");
    }
    else {
        throw new IllegalArgumentException("Logout failed, please try again");
    }
}
}

public void createScooter(String station) {
    if (!stations.containsKey(station)) {
        throw new IllegalArgumentException("Station does not exist.");
    }
    Scooter newScooter = new Scooter(station);
    App.scooters.put(newScooter.getSerial(), newScooter);
    App.stations.get(station).add(newScooter);

}


public void rentScooter(String station, String username) {
   if (stations.containsKey(station) && stations.get(station) != null) {
        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.getloginStatus() == true) {
                Scooter scooterChosen = stations.get(station).get(0);
                scooterChosen.setScooterUser(user);
                scooterChosen.setStationNull();
                stations.get(station).remove(scooterChosen);
                System.out.println("User: " + username + " has rented Scooter: " + scooterChosen.getSerial() + " from: " + station);
            }
        }
    }   
    else {
        throw new IllegalArgumentException("Scooter not available. Try again later.");
    }
}

public void dockScooter(String station, String username) {
if (stations.containsKey(station)) {
    for (Scooter scooter : scooters.values()) {
        if (scooter.getScooterUser() != null && scooter.getScooterUser().getUsername().equals(username) && scooter.getScooterUser().getloginStatus().equals(true)) {
            stations.get(station).add(scooter);
            scooter.setScooterUserNull(scooter.getScooterUser());
            scooter.setStation(station);
            System.out.println("User: " + username + " has docked Scooter: " + scooter.getSerial() + " at: " + station);
        }
    }
}
    else {
        throw new IllegalArgumentException("Docking not available. Try again later.");
    }
}
}


