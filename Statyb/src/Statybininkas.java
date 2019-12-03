import java.util.Comparator;

public class Statybininkas implements Comparable {
    private String vardas;
    private String isilavinimas;
    private int stazas;
    private double atlyginimas;

    public Statybininkas(String vardas, String isilavinimas, int stazas, double atlyginimas) {
        this.vardas = vardas;
        this.isilavinimas = isilavinimas;
        this.stazas = stazas;
        this.atlyginimas = atlyginimas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getIsilavinimas() {
        return isilavinimas;
    }

    public void setIsilavinimas(String isilavinimas) {
        this.isilavinimas = isilavinimas;
    }

    public int getStazas() {
        return stazas;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    public double getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    @Override
    public String toString() {
        return "Statybininkas{" +
                "vardas='" + vardas + '\'' +
                ", isilavinimas='" + isilavinimas + '\'' +
                ", stazas=" + stazas +
                ", atlyginimas=" + atlyginimas +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return Comparator
                .comparing(Statybininkas::getAtlyginimas)
                .reversed()
                .thenComparing(Statybininkas::getVardas)
                .compare(this, (Statybininkas) o);
    }
}
