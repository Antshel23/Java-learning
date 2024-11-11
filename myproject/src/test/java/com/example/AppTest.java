package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMethod() {
        int expected = 10;
        int actual = 5 + 4;
        
        assertEquals(expected, actual);
        
        // Print output on test pass
        System.out.println("Test passed: 5 + 5 equals " + expected);
    }
}


