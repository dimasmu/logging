package com.example.java.logging;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

    private static final Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    void testLog() {
        System.out.println("Hello Logger");
        log.info("Hello Logger");
        System.out.println("Belajar Java Logging");
        log.info("Belajar Java Logging");
    }

}
