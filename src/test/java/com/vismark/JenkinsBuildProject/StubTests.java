package com.vismark.JenkinsBuildProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class StubTests {

    @Test
    void stubTestOne() {
        System.out.println("Executing stubTestOne");
        assertTrue(true);
    }

    @Test
    void stubTestTwo() {
        System.out.println("Executing stubTestTwo");
        assertTrue(true);
    }

    @Test
    void stubTestThree() {
        System.out.println("Executing stubTestThree");
        assertTrue(true);
    }
}
