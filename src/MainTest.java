import static org.junit.jupiter.api.Assertions.*;

class  MainTest {

    @org.junit.jupiter.api.Test
    void parenthesesCheck() {
        assertEquals(true, Main.parenthesesCheck("()"));
        assertEquals(false, Main.parenthesesCheck(")(()))"));
        assertEquals(false, Main.parenthesesCheck("("));
        assertEquals(true, Main.parenthesesCheck("(())((()())())"));
    }

    @org.junit.jupiter.api.Test
    void reverseInteger() {
        assertEquals("4321", Main.reverseInteger(1234));
        assertEquals("8642", Main.reverseInteger(2468));
        assertEquals("1777", Main.reverseInteger(7771));
    }

    @org.junit.jupiter.api.Test
    void encryptThis() {
        assertEquals("72olle 103doo 100ya", Main.encryptThis("Hello good day"));
        assertEquals("82yade 115te 103o", Main.encryptThis("Ready set go"));
    }

    @org.junit.jupiter.api.Test
    void decipherThis() {
        assertEquals("Hello good day", Main.decipherThis("72olle 103doo 100ya"));
        assertEquals("Ready set go", Main.decipherThis("82yade 115te 103o"));
    }

}

