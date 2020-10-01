package csvParser;

import java.util.Objects;

public class Propety {
    char separator;
    String plus;
    String pathTo;
    String pathFrom ;
    Propety()
    {
        separator = ',';
        plus = "+";
        pathTo = "text.csv";
        pathFrom = "result.txt";
    }
    Propety(String plas)
    {
        separator = ',';
        plus = plas;
        pathTo = "text.csv";
        pathFrom = "result.txt";
    }
    Propety( String plas,String to)
    {
        separator = ',';
        plus = plas;
        pathTo = to;
        pathFrom = "result.txt";
    }
    Propety( String plas,String to, String from)
    {
        separator = ',';
        plus = plas;
        pathTo = to;
        pathFrom = from;
    }
    Propety( String plas,String to, String from, char separ)
    {
        separator = separ;
        plus = plas;
        pathTo = to;
        pathFrom = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propety propety = (Propety) o;
        return separator == propety.separator &&
                plus.equals(propety.plus) &&
                pathTo.equals(propety.pathTo) &&
                pathFrom.equals(propety.pathFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(separator, plus, pathTo, pathFrom);
    }
}
