package scooterapp;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class App {

static Map<String, Integer> stations;
static ArrayList<String> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", 0);
    stations.put("Euston", 0);
    stations.put("St Pancras", 0);
    registeredUsers = new ArrayList<String>();
}

public void registerUser(String username, String password, int age) {
    User newUser = new User(username, password, age);
}

public void createScooter(String station) {
    Scooter newScooter = new Scooter(station);
}



}

