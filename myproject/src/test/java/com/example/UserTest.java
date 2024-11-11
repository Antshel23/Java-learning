package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testRegisterUser() {
        App app1 = new App();
        app1.registerUser("Ant1", "password1", 22);
        User test1 = App.registeredUsers.get(0);
        assertEquals("Ant1", test1.getUsername());
        assertEquals("password1", test1.getPassword());
        assertEquals(22, test1.getAge());
        assertFalse(test1.getloginStatus());
    }

    @Test
    public void testAgeVerification() {
        App app2 = new App();
        IllegalArgumentException ageVerification = assertThrows(IllegalArgumentException.class, () -> { 
            app2.registerUser("Wrong age", "password1", 17); 
        });
        assertEquals("Minimum age: 18 required for registration.", ageVerification.getMessage());
        assertEquals(0, app2.registeredUsers.size());
    }

    @Test
    public void testLoginLogoutUser() {
        App app3 = new App();
        app3.registerUser("Ant1", "password1", 22);
        User test1 = App.registeredUsers.get(0);
        assertFalse(test1.getloginStatus());
        app3.loginUser("Ant1", "password1");
        assertTrue(test1.getloginStatus());
        app3.logoutUser("Ant1");
        assertFalse(test1.getloginStatus());
    }

    @Test
    public void testCreateScooter() {
        App app4 = new App();
        app4.createScooter("Kings Cross");
        app4.createScooter("Kings Cross");

        assertEquals(2,app4.stations.get("Kings Cross").size());
        app4.createScooter("Euston");
        assertEquals(1,app4.stations.get("Euston").size());

        Scooter serial1 = app4.scooters.get(1);
        Scooter serial2 = app4.scooters.get(2);
        System.out.println(app4.scooters);
        System.out.println(serial1);
        System.out.println(serial1.getSerial());

        assertEquals(1, serial1.getSerial());
        assertEquals(2, serial2.getSerial());
    }

    @Test
    public void testRentScooter() {
        App app5 = new App();
        app5.registerUser("Ant1", "password1", 22);
        app5.loginUser("Ant1", "password1");
        app5.createScooter("Kings Cross");
        app5.createScooter("Kings Cross");
        assertEquals(2,app5.stations.get("Kings Cross").size());
        app5.createScooter("Euston");

        Scooter serialTest = app5.scooters.get(1);
        assertEquals("Kings Cross", serialTest.getStation());
        app5.rentScooter("Kings Cross", "Ant1");
        assertNull(serialTest.getStation());
        assertEquals(1,app5.stations.get("Kings Cross").size());
        assertNotNull(serialTest.getScooterUser());
    }

}


