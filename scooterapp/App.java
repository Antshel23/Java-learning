package scooterapp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class App {

static Map<String, List<Integer>> stations;
static ArrayList<String> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", new ArrayList<>());
    stations.put("Euston", new ArrayList<>());
    stations.put("St Pancras", new ArrayList<>());
    registeredUsers = new ArrayList<String>();
}

public void registerUser(String username, String password, int age) {
    User newUser = new User(username, password, age);
}

public void loginUser(String username, String password) {
// if username exists in registeredUsers, and password = user[x].getPassword() & loginStatus = false
}

public void logoutUser(String username) {
//if username exists in registeredUsers and loginStatus = true
}

public void createScooter(String station) {
    Scooter newScooter = new Scooter(station);
}

public void dockScooter(String station, Scooter scooter) {
    //if station exists in stations, scooter exists in scooter list
}

public void rentScooter(Scooter scooter) {

}
}


