package bazine;

public class MoketojasImpl implements Moketojas {
    private long moketojoKodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private int suma;

    public MoketojasImpl(long moketojoKodas, String vardas, String pavarde, String adresas, int suma){
        this.moketojoKodas = moketojoKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }
    public long getMoketojoKodas(){
        return moketojoKodas;
    }
    public String getVardas(){
        return vardas;
    }
    public String getPavarde(){
        return pavarde;
    }
    public String getAdresas(){
        return adresas;
    }
    public int getSuma(){
        return suma;
    }
    public void setMoketojoKodas(long moketojoKodas){
        this.moketojoKodas = moketojoKodas;
    }
    public void setVardas(String vardas){
        this.vardas = vardas;
    }
    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }
    public void setAdresas(String adresas){
        this.adresas = adresas;
    }
    public void setSuma(int suma){
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "MoketojasImpl{" +
                "moketojoKodas=" + moketojoKodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", adresas='" + adresas + '\'' +
                ", suma=" + suma +
                '}';
    }
}
