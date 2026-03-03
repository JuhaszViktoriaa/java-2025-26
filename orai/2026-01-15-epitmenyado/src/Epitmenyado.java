public class Epitmenyado {
    private int adoszam;
    private String utca;
    private String hazszam;
    private String adosav;
    private int alapterulet;

    public Epitmenyado(String[] sorok) {
        this.adoszam = Integer.parseInt(sorok[0]);
        this.utca = sorok[1];
        this.hazszam = sorok[2];
        this.adosav = sorok[3];
        this.alapterulet = Integer.parseInt(sorok[4]);
    }


    public int getAdoszam() {
        return adoszam;
    }

    public String getUtca() {
        return utca;
    }

    public String getHazszam() {
        return hazszam;
    }

    public String getAdosav() {
        return adosav;
    }

    public int getAlapterulet() {
        return alapterulet;
    }
}