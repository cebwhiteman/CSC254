import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static String allowed = "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?";
    final static double DELTA = 0.001;

    @Test
    void countSpecialCharacters() {
        assertEquals(2, Main.countSpecialCharacters("gogg!e$", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(0, Main.countSpecialCharacters("goggles", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(4, Main.countSpecialCharacters("@#gogg!e$", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(5, Main.countSpecialCharacters("@#gogg!e*$", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(0, Main.countSpecialCharacters("abc","!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));

    }

    @Test
    void hasDigits() {
        assertTrue(Main.hasDigits("abc123"));
        assertTrue(Main.hasDigits("0"));
        assertTrue(Main.hasDigits("9"));
        assertTrue(Main.hasDigits("123456"));
        assertTrue(Main.hasDigits("123Abc"));
        assertFalse(Main.hasDigits(""));
        assertFalse(Main.hasDigits("/"));
        assertFalse(Main.hasDigits(":"));
        assertFalse(Main.hasDigits("abc"));
        assertFalse(Main.hasDigits("Ahoy treasure!"));
        assertFalse(Main.hasDigits("Filet mignon is best cooked medium rare"));
    }

    @Test
    void hasUpperCase() {
        assertTrue(Main.hasUpperCase("This is the way the world ends"));
        assertTrue(Main.hasUpperCase("This Is The Way The World Ends"));
        assertTrue(Main.hasUpperCase("thiS iS thE waY thE worlD endS"));
        assertFalse(Main.hasUpperCase("not with a bang"));
        assertFalse(Main.hasUpperCase("but a whimper"));

    }

    @Test
    void hasLowerCase() {
        assertTrue(Main.hasLowerCase("not with a bang"));
        assertTrue(Main.hasLowerCase("But A Whimper"));
        assertFalse(Main.hasLowerCase("THIS IS THE WAY THE WORLD ENDS"));

    }

    @Test
    void trimmedLength() {
        assertEquals(3, Main.trimmedLength("dog"));
        assertEquals(0, Main.trimmedLength(""));
        assertEquals(5, Main.trimmedLength("TruCK"));
        assertEquals(14, Main.trimmedLength("san23francisco"));
        assertEquals(6, Main.trimmedLength("willow  "));
    }

    @Test
    void calculateRange() {
        assertEquals(64, Main.calculateRange("J'apprendsD3sCh@ses", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(54, Main.calculateRange("J'apprendsDesCh@ses", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(38, Main.calculateRange("j'apprendsd3sch@ses", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(10, Main.calculateRange("012345", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));
        assertEquals(0, Main.calculateRange("", "!@#$%^&*()_+-=,./[]\\{}|;':\"<>?"));

}

    @Test
    void log2() {
        assertEquals(6, Main.log2(64), DELTA);
        assertEquals(4.643856, Main.log2(25), DELTA);
        assertEquals(1.321928, Main.log2(2.5), DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, Main.log2(0), DELTA);
        assertEquals(Double.NaN, Main.log2(-1), DELTA);
        assertEquals(9.96651, Main.log2(1000.5), DELTA);
    }
}