package scooterapp;

public class Scooter {

private String station;
private User user;
private int serial;
static int nextSerial = 1;

public Scooter(String station) {
    if (App.stations.containsKey(station)) {
    this.station = station;
    this.serial = nextSerial;
    nextSerial++;
    }
    else {
        throw new IllegalArgumentException("Station does not exist");
    }
}

public void rentScooter(User user, String station) {
    
}

public void dockScooter(User user, String station) {
    
}

}
