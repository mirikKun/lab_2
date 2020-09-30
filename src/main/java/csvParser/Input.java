package csvParser;

import java.util.Scanner;

public class Input {
    private static Propety ff;

    public static Propety newIn() {
        return getIn(new Asker(System.in, System.out));
    }

    public static Propety getIn(Asker asker)
    {
        Scanner Scan = new Scanner(System.in);
        //System.out.println("Введите итоговый сепаратор:");
        String plus = asker.ask("Введите итоговый сепаратор:");
        if (!plus.equals("")) {
            //System.out.println("Введите путь к файлу:");
            String to = asker.ask("Введите путь к файлу:");
            if (!to.equals("")){
                //System.out.println("Введите путь создания:");
                String from = asker.ask("Введите путь создания:");
                if (!from.equals("")){
                    //System.out.println("Введите сепаратор:");
                    String sep = asker.ask("Введите сепаратор:");
                    if (!sep.equals(""))
                        ff=new Propety(plus,to,from,sep.charAt(0));
                    else
                        ff=new Propety(plus,to,from);
                }
                else ff=new Propety(plus,to);
            }
            else
                ff=new Propety(plus);
        }
        else{
            ff= new Propety();
        }
        return ff;
    }
}
