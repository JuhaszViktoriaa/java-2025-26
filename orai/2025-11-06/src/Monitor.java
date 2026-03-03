public class Monitor {              //attributumok
    private String szin;
    private String felbontas;
    private int kepfrissites;

    public Monitor(String szin, String felbontas, int kepfrissites) {      //konstruktor
        this.szin = szin;
        this.felbontas = felbontas;
        this.kepfrissites = kepfrissites;
    }

    public int getKepfrissites() {
        return kepfrissites;
    }

    public void setKepfrissites(int kepfrissites){      //nincs visszateresi ertek, ezert void
        this.kepfrissites=kepfrissites;
    }

    //@Override
    //public String toString(){
        //return "helo "+szin;
    //}

    @Override
    public String toString() {
        return "Monitor{" +
                "szin='" + szin + '\'' +
                ", felbontas='" + felbontas + '\'' +
                ", kepfrissites=" + kepfrissites +
                '}';
    }
}
