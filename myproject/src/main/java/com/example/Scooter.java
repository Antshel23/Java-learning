package com.example;

public class Scooter {

private String station;
private User scooterUser;
private int serial;
static int nextSerial = 1;

public Scooter(String station) {
    this.station = station;
    this.serial = nextSerial++;
    System.out.println("Scooter: " + this.serial + " added at station: " + this.station);
}

public String getStation() {
    return this.station;
}

public User getScooterUser() {
    return this.scooterUser;
}

public int getSerial() {
    return this.serial;
}

public void setStation(String station) {
    if (this.station == null) {
        this.station = station;
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
