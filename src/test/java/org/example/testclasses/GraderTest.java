package org.example.testclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void nintyoneWillReturnA(){
        var graderTest = new Grader();
        assertEquals('A',graderTest.determineLetterGrade(98));
    }

    @Test
    void seventysixWillReturnB(){
        var graderTest = new Grader();
        assertEquals('B',graderTest.determineLetterGrade(76));
    }

    @Test
    void fourtyfourWillReturnC(){
        var graderTest = new Grader();
        assertEquals('C',graderTest.determineLetterGrade(44));
    }

    @Test
    void thirtyWIllReturnf(){
        var graderTest = new Grader();
        assertEquals('F',graderTest.determineLetterGrade(30));
    }

    //For throwing exception we use assertthrows
    @Test
    void ifzeroOrlessthanzero(){
        var graderTest = new Grader();
        assertThrows(IllegalArgumentException.class,
        () -> {
            graderTest.determineLetterGrade(-1);
        }
        );
    }

}