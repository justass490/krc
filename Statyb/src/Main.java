import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    /*
    Sukurti 10 statybininko objektų ir sudėti juos
        į pasirinktą masyvą:
    - atspausdinti (naudojant iteratorius ir paprastai)
        vartotojui į ekraną informaciją apie statybininkus;
     */

        public static void main(String[] args) {
            Statybininkas Simas = new Statybininkas ("Simas" , "KITM" , 5 , 500);
            Statybininkas Tomas = new Statybininkas ("Tomas" , "KITM" , 2 , 200);
            Statybininkas Dovydas = new Statybininkas ("Dovydas" , "KITM" , 10 , 500);
            Statybininkas Justas = new Statybininkas ("Justas" , "KITM" , 15 , 100);
            Statybininkas Arnoldas = new Statybininkas ("Arnoldas" , "KITM" , 1 , 550);
            Statybininkas Petras = new Statybininkas ("Petras" , "KITM" , 6 , 500);
            Statybininkas Lukas = new Statybininkas ("Lukas" , "KITM" , 8 , 150);
            Statybininkas Ieva = new Statybininkas ("Ieva" , "KITM" , 5 , 500);
            Statybininkas Migle = new Statybininkas ("Migle" , "KITM" , 5 , 800);

            ArrayList<Statybininkas> saugykla= new ArrayList<Statybininkas>();
            saugykla.add(Simas);
            saugykla.add(Tomas);
            saugykla.add(Dovydas);
            saugykla.add(Justas);
            saugykla.add(Arnoldas);
            saugykla.add(Petras);
            saugykla.add(Lukas);
            saugykla.add(Ieva);
            saugykla.add(Migle);
            System.out.println("Sarasas su pradiniais objektais");
            System.out.println(saugykla);

            Iterator<Statybininkas> i = saugykla.iterator();
            while (i.hasNext()) {
                Statybininkas obj = i.next();
                if (obj.getStazas()<4)
                    i.remove();
            }
            System.out.println("Sarasas po istrinimu");

            for (Statybininkas statybininkas: saugykla){
                System.out.println(statybininkas);
            }

            System.out.println("Sarasas surykiuotas pagal atlyginima");
            Collections.sort(saugykla);
            System.out.println(saugykla);
    }

}
