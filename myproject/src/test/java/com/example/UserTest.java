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
        App app1 = new App();
        IllegalArgumentException ageVerification = assertThrows(IllegalArgumentException.class, () -> { 
            app1.registerUser("Wrong age", "password1", 17); 
        });
        assertEquals("Minimum age: 18 required for registration.", ageVerification.getMessage());
        assertEquals(0, app1.registeredUsers.size());
    }

    @Test
    public void testLoginLogoutUser() {
        App app1 = new App();
        app1.registerUser("Ant1", "password1", 22);
        User test1 = App.registeredUsers.get(0);
        assertFalse(test1.getloginStatus());
        app1.loginUser("Ant1", "password1");
        assertTrue(test1.getloginStatus());
        app1.logoutUser("Ant1");
        assertFalse(test1.getloginStatus());
    }

}


