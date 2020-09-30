package csvParser;

import org.junit.jupiter.api.Test;

import static csvParser.Input.getIn;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class InputTest {

    @Test
    void newIn() {
        Asker asker = mock(Asker.class);
        when(asker.ask("Введите итоговый сепаратор:")).thenReturn("*");
        when(asker.ask("Введите путь к файлу:")).thenReturn("text.csv");
        when(asker.ask("Введите путь создания:")).thenReturn("result.txt");
        when(asker.ask("Введите сепаратор:")).thenReturn(",");

        Propety expectedProperty = new Propety();
        Propety actualProperty = getIn(asker);

        verify(asker).ask("ENTER FILE NAME: ");
        verify(asker).ask("ENTER SEPARATOR: ");
        assertEquals(expectedProperty, actualProperty);
    }
}