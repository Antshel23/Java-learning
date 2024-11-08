package scooterapp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class App {

static Map<String, List<Integer>> stations;
static ArrayList<User> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", new ArrayList<>());
    stations.put("Euston", new ArrayList<>());
    stations.put("St Pancras", new ArrayList<>());
    registeredUsers = new ArrayList<User>();
}

public void registerUser(String username, String password, int age) {
    User newUser = new User(username, password, age);
}

public void loginUser(String username, String password) {
// if username exists in registeredUsers, and password = user[x].getPassword() & loginStatus = false
    for (User user : registeredUsers) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getloginStatus().equals(false)) {
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
}

public void createScooter(String station) {
    Scooter newScooter = new Scooter(station);
}

public void dockScooter(String station) {
    //if station exists in stations, if user has scooter
}

public void rentScooter(String station) {
    //if station exists in station, if station != empty
}
}


