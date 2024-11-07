package scooterapp;

public class Scooter {

private String station;
private String scooterUser;
private int serial;
static int nextSerial = 1;

public Scooter(String station) {
    if (App.stations.containsKey(station)) {
    this.station = station;
    this.serial = nextSerial;
    nextSerial++;
    App.stations.compute(station, (key, value) -> value+1);
    System.out.println("Scooter: " + this.serial + " added at station: " + this.station);
    }
    else {
        System.err.println("ERROR: Station does not exist");
    }
}

public String getStation() {
    return station;
}

public String getScooterUser() {
    return scooterUser;
}

public int getSerial() {
    return serial;
}



}
