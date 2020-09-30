package csvParser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropetyTest {

    @Test
    void propertys(){
        Propety prop = new Propety();
        assertEquals(prop.separator,',');

        Propety prop1 = new Propety("+");
        assertEquals(prop1.separator,',');

        Propety prop2 = new Propety("+","text.csv");
        assertEquals(prop2.separator,',');

        Propety prop3 = new Propety("+","text.csv","result.txt");
        assertEquals(prop3.separator,',');
        Propety prop4 = new Propety("+","text.csv","result.txt",',');
        assertEquals(prop4.separator,',');
    }
}