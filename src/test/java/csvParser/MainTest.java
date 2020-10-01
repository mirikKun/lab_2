package csvParser;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static csvParser.Input.newIn;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MainTest {

    @Test
    void work() throws IOException {
        Propety propety = new Propety("*", "text.csv", "result.txt", ',');
        Main.work(propety);

        File file = new File("src/main/resources/result.txt");
        Scanner scan= new Scanner(file);
        List<String> lines= new ArrayList<>();
        while (scan.hasNext()) {
            lines.add(scan.nextLine());
        }
        assertEquals(lines.get(0), "2*2*0*6");
    }
}