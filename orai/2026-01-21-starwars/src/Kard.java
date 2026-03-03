public class Kard {
    private String karakter;
    private String rend;
    private String szin;
    private int szam;

    public String getKarakter() {
        return karakter;
    }

    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

    public String getRend() {
        return rend;
    }

    public void setRend(String rend) {
        this.rend = rend;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    public Kard(String karakter, String rend, String szin, int szam) {
        this.karakter = karakter;
        this.rend = rend;
        this.szin = szin;
        this.szam = szam;
    }

    public Kard(String[] darabolt) {
        this.karakter = darabolt[0];
        this.rend = darabolt[1];
        this.szin = darabolt[2];
        this.szam = Integer.parseInt(darabolt[3]);
    }

    @Override
    public String toString() {
        return "Kard{" +
                "karakter='" + karakter + '\'' +
                ", rend='" + rend + '\'' +
                ", szin='" + szin + '\'' +
                ", szam=" + szam +
                '}';
    }
}
//narancs szinu kard felvetele, dictionary