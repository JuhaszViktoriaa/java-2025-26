public class Car {
    private int sorszam;
    private String marka;
    private String modell;
    private int gyartasiev;
    private String szin;
    private int dbszam;
    private int eladasiar;

    //public Car(int i, String s, String s1, String s2, String s3, String s4) {}


    public Car(int sorszam, String marka, String modell, int gyartasiev, String szin, int dbszam, int eladasiar) {
        this.sorszam = sorszam;
        this.marka = marka;
        this.modell = modell;
        this.gyartasiev = gyartasiev;
        this.szin = szin;
        this.dbszam = dbszam;
        this.eladasiar = eladasiar;
    }

    public int getSorszam() {
        return sorszam;
    }

    public String getMarka() {
        return marka;
    }

    public String getModell() {
        return modell;
    }

    public int getGyartasiev() {
        return gyartasiev;
    }

    public String getSzin() {
        return szin;
    }

    public int getDbszam() {
        return dbszam;
    }

    public int getEladasiar() {
        return eladasiar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sorszam=" + sorszam +
                ", marka='" + marka + '\'' +
                ", modell='" + modell + '\'' +
                ", gyartasiev=" + gyartasiev +
                ", szin='" + szin + '\'' +
                ", dbszam=" + dbszam +
                ", eladasiar=" + eladasiar +
                '}';
    }
}