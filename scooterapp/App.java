package scooterapp;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class App {

public static Map<String, Integer> stations;
public static ArrayList<String> registeredUsers;

public App() {
    stations = new HashMap<>();
    stations.put("Kings Cross", 0);
    stations.put("Euston", 0);
    stations.put("St Pancras", 0);
    registeredUsers = new ArrayList<String>();
}


}
