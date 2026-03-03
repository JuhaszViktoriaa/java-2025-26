public class Game {
    private String cim;
    private String mufaj;
    private String kiado;
    private int ertekeles;
    private double eladva;
    private int megjelenes;
    private int bevetel;
    private int jatekosok;
    private int fejlkoltseg;

    public Game(String cim, String mufaj, String kiado, int ertekeles, double eladva, int megjelenes, int bevetel, int jatekosok, int fejlkoltseg) {
        this.cim = cim;
        this.mufaj = mufaj;
        this.kiado = kiado;
        this.ertekeles = ertekeles;
        this.eladva = eladva;
        this.megjelenes = megjelenes;
        this.bevetel = bevetel;
        this.jatekosok = jatekosok;
        this.fejlkoltseg = fejlkoltseg;
    }

    public Game(String[] darabolt){
        this.cim = darabolt[0];
        this.mufaj = darabolt[1];
        this.kiado = darabolt[2];
        this.ertekeles = Integer.parseInt(darabolt[3]);
        this.eladva = Double.parseDouble(darabolt[4]);
        this.megjelenes = Integer.parseInt(darabolt[5]);
        this.fejlkoltseg = Integer.parseInt(darabolt[6]);
        this.bevetel = Integer.parseInt(darabolt[7]);
        this.jatekosok = Integer.parseInt(darabolt[8]);
    }

    @Override
    public String toString() {
        return "Game{" +
                "cim='" + cim + '\'' +
                ", mufaj='" + mufaj + '\'' +
                ", kiado='" + kiado + '\'' +
                ", ertekeles=" + ertekeles +
                ", eladva=" + eladva +
                ", megjelenes=" + megjelenes +
                ", bevetel=" + bevetel +
                ", jatekosok=" + jatekosok +
                ", fejlkoltseg=" + fejlkoltseg +
                '}';
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }

    public String getKiado() {
        return kiado;
    }

    public void setKiado(String kiado) {
        this.kiado = kiado;
    }

    public int getErtekeles() {
        return ertekeles;
    }

    public void setErtekeles(int ertekeles) {
        this.ertekeles = ertekeles;
    }

    public double getEladva() {
        return eladva;
    }

    public void setEladva(double eladva) {
        this.eladva = eladva;
    }

    public int getMegjelenes() {
        return megjelenes;
    }

    public void setMegjelenes(int megjelenes) {
        this.megjelenes = megjelenes;
    }

    public int getBevetel() {
        return bevetel;
    }

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }

    public int getJatekosok() {
        return jatekosok;
    }

    public void setJatekosok(int jatekosok) {
        this.jatekosok = jatekosok;
    }

    public int getFejlkoltseg() {
        return fejlkoltseg;
    }

    public void setFejlkoltseg(int fejlkoltseg) {
        this.fejlkoltseg = fejlkoltseg;
    }
}