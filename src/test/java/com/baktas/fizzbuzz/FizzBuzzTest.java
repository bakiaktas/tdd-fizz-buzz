package com.baktas.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenTheNumberIsDividedByThree() {
        assertEquals("Fizz", fizzBuzz.stringFor(3));
    }

    @Test
    void returnBuzzWhenTheNumberIsDividedByFive() {
        assertEquals("Buzz", fizzBuzz.stringFor(5));
    }

    @Test
    void returnFizzBuzzWhenTheNumberIsDividedBothOfThreeAndFive() {
        assertEquals("Fizz Buzz", fizzBuzz.stringFor(15));
    }

    @Test
    void returnTheNumberItselfWhenTheNumberIsNotDividedAnyOfThreeOrFive() {
        assertEquals("7", fizzBuzz.stringFor(7));
    }

    @Test
    void throwsIllegalArgumentExceptionWhenTheNumberLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.stringFor(-1));
    }
}