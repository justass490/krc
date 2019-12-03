public class Automobilis {
    private int rida;
    private String marke;
    private int metai;
    private int durys;

    public Automobilis(int rida, String marke, int metai, int durys){
        this.rida = rida;
        this.marke = marke;
        this.metai = metai;
        this.durys = durys;
    }
    public int getRida(){
        return rida;
    }
    public void setRida(int rida){
        this.rida = rida;
    }
    public String getMarke(){
        return marke;
    }
    public void setMarke(String marke){
        this.marke = marke;
    }
    public int getMetai(){
        return metai;
    }
    public void setMetai(int metai){
        this.metai = metai;
    }
    public int getDurys(){
        return durys;
    }
    public void setDurys(int durys){
        this.durys = durys;
    }
}
