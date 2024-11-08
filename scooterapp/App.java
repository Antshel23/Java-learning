package scooterapp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class App {

static Map<String, List<Integer>> stations;
static Map<Integer, Scooter> scooters;
static ArrayList<User> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", new ArrayList<>());
    stations.put("Euston", new ArrayList<>());
    stations.put("St Pancras", new ArrayList<>());
    registeredUsers = new ArrayList<User>();
    scooters = new HashMap<>();
}

public void registerUser(String username, String password, int age) {
    User newUser = new User(username, password, age);
}

public void loginUser(String username, String password) {
    for (User user : registeredUsers) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getloginStatus() == false) {
            user.setLoginStatus();
            System.out.println(username + " has logged in");
        }
        else {
            System.err.println("ERROR: Login failed, please try again");
        }
    }
}

public void logoutUser(String username) {
//if username exists in registeredUsers and loginStatus = true
for (User user : registeredUsers) {
    if (user.getUsername().equals(username) && user.getloginStatus() == true) {
        user.setLoginStatus();
        System.out.println(username + " has logged out");
    }
    else {
        System.err.println("ERROR: Logout failed, please try again");
    }
}
}

public void createScooter(String station) {
    Scooter newScooter = new Scooter(station);
    scooters.put(newScooter.getSerial(), newScooter);
}


public void rentScooter(String station, String username) {
    //if station exists in station, if station != empty, setscooterusernull, setstationnull, remove serial from stations
   // if (stations.containsKey(station) && !stations.get(station).isEmpty()) {
        //for (User user : registeredUsers) {
            //if (user.getUsername().equals(username) && user.getloginStatus() == true) {

           // }
    //}
}

public void dockScooter(String station, String username) {
    //if station exists in stations, if user has scooter
    
}
}


