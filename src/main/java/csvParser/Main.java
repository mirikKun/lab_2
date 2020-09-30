package csvParser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final char quote ='\"';

    public static void main(String[] args) throws IOException {
        Propety ff= Input.newIn();
        File text = new File("src/main/resources/"+ff.pathTo);
        File file = new File("src/main/resources/"+ff.pathFrom);
        Formater KOLIA=new Formater();
        String absolutePath = file.getAbsolutePath();
        StringBuilder result = new StringBuilder();
        Scanner scan= new Scanner(text);
        List<String> lines= new ArrayList<>();
        while (scan.hasNext()) {
            lines.add(KOLIA.format(Parser.parseLine(scan.nextLine(),ff.separator,quote),ff.plus));
        }
        lines.forEach(line -> result.append(line));
        Files.write(Paths.get(absolutePath), Collections.singletonList(result), StandardCharsets.UTF_8);
        System.out.println(absolutePath);
    }
}
