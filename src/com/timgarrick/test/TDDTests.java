package com.timgarrick.test;

import com.timgarrick.main.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import com.timgarrick.main.TDDClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TDDTests {

    @Test
    @DisplayName("First TDD test to see if we can create a TDDObject")
    void createTDDClass() {
        TDDClass tddClass = new TDDClass("Constructor string");
        assertNotNull(tddClass);
    }

    TDDClass tddClass = new TDDClass("Constructor string");

    @Test
    @DisplayName("Change the string attribute to another value")
    void updateTDDClassConstructorStringValue() {
        tddClass.setConstructorStringName("Test");
        assertEquals("Test",tddClass.getContr);
    }
}