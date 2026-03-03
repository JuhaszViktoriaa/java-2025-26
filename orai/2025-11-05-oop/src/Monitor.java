public class Monitor {
    private String szin;
    private String felbontas;
    private int kepfrissites;

    @Override
    public String toString() {
        return "Monitor{" +
                "szin='" + szin + '\'' +
                ", felbontas='" + felbontas + '\'' +
                '}';
    }

    public Monitor(String szin, String felbontas, int kepfrissites){
        this.szin = szin;
        this.felbontas = felbontas;
        this.kepfrissites = kepfrissites;
    }     //alt+insert => constructor

    public String getSzin(){
        return szin;
    }

    public String getFelbontas() {
        return felbontas;
    }

    public int getKepfrissites() {
        return kepfrissites;
    }
}