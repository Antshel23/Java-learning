package scooterapp;

public class Scooter {

private String station;
private User scooterUser;
private int serial;
static int nextSerial = 1;

public Scooter(String station) {
    if (App.stations.containsKey(station)) {
    this.station = station;
    this.serial = nextSerial;
    nextSerial++;
    App.stations.get(station).add(this);
    App.scooters.put(this.serial, this);
    System.out.println("Scooter: " + this.serial + " added at station: " + this.station);
    }
    else {
        System.err.println("ERROR: Station does not exist");
    }
}

public String getStation() {
    return station;
}

public User getScooterUser() {
    return scooterUser;
}

public int getSerial() {
    return serial;
}

public void setStation(String station) {
    if (this.station == null) {
        this.station = station;
        App.stations.get(station).add(this);
    }
}

public void setStationNull() {
    if (this.station != null) {
        this.station = null;
    }
}

public void setScooterUser(User scooterUser) {
if (this.scooterUser == null) {
    this.scooterUser = scooterUser;
}
}

public void setScooterUserNull(User scootUser) {
    if (this.scooterUser != null) {
        this.scooterUser = null;
    }
}

}
