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
    App.stations.get(station).add(this.serial);
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

public void setStation() {

}

public void setScooterUser() {
    
}


}
