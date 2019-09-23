import java.util.Scanner;

public class atlygis {
    public static void main(String[] args){
        double darbas, atlygis = 0, norma;
        double k1 = 0.5, k2 = 1, k3 = 1.5;
        Scanner s = new Scanner(System.in);
        System.out.println("Įveskite atliktą darbą: ");
        darbas = s.nextDouble();
        System.out.println("Įveskite normą: ");
        norma = s.nextDouble();
            if (darbas < norma){
                atlygis = 600 * k1;
            }
            else if (darbas >= norma && darbas < norma * 1.5){
                atlygis = 600 * k2;
        }
            else if (darbas >= norma * 1.5){
                atlygis = 600 * k3;
        }
        System.out.println("tavo atlygis yra: " + atlygis);
    }
}
