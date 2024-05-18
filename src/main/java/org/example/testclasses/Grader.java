package org.example.testclasses;

public class Grader {
    public char determineLetterGrade(int mark){
        if(mark <= 0){
            throw new IllegalArgumentException("NUMBER IS EITHER 0 OR LESS THAN 0");
        }
        else if (mark <= 100 && mark >= 90) {
            return 'A';
        }
        else if (mark <= 80 && mark >= 60) {
            return 'B';
        }
        else if (mark <= 50 && mark >= 40) {
            return 'C';
        }
        return 'F';
    }
}
