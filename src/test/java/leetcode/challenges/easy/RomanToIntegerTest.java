package leetcode.challenges.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void checkOne() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(1, transform.romanToInt("I"));
    }
    @Test
    void checkTwo() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(2, transform.romanToInt("II"));
    }
    @Test
    void checkThree() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(3, transform.romanToInt("III"));
    }
    @Test
    void checkFour() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(4, transform.romanToInt("IV"));
    }
    @Test
    void checkFive() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(5, transform.romanToInt("V"));
    }
    @Test
    void checkSeven() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(7, transform.romanToInt("VII"));
    }

    @Test
    void checkEight() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(8, transform.romanToInt("VIII"));
    }

    @Test
    void checkNine() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(9, transform.romanToInt("IX"));
    }

    @Test
    void checkEleven() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(11, transform.romanToInt("XI"));
    }

    @Test
    void checkFourtyOne() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(41, transform.romanToInt("XLI"));
    }

    @Test
    void checkFiveHundertFiftyFife() {
        RomanToInteger transform = new RomanToInteger();
        Assertions.assertEquals(555, transform.romanToInt("DLV"));
    }
}