package csvParser;

import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FormaterTest {
    private Formater formater;
    @BeforeEach
    public void setUp() {
        formater = new Formater();
    }

    @org.junit.jupiter.api.Test
    void format() {
        String expected="2+2+0+9\n";

        String actual =formater.format(Arrays.asList("10", "AU", "", "Australia"),"+");
        assertEquals(expected, actual);
    }
}