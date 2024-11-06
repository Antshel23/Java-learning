public class car {
    String name;
    int speed;

    public car(String name, int speedp) {
        this.name = name;
        this.speed = speedp;
    }

    static void getName(car obj) {
        System.out.println(obj.name);
    }

    public void getSpeed() {
        System.out.println(speed);
    }

    
    public static void main(String[] args) {
        car newObj = new car("Ford", 40);
        getName(newObj);
        newObj.getSpeed();

        driver newDriver = new driver("Ford", "Ant");
        newDriver.driveNoise();
    }
}

class driver extends car {
String driverName;

public driver(String carName, String driverName) {
    super(carName, 20);
    this.driverName = driverName;
}

    public void driveNoise() {
    System.out.println(name + " drove by: " + driverName + " at: " + speed);
    }

}