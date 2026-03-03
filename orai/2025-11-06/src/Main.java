import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---oop 2---");

        //Monitor m=new Monitor("fekete", "1920x1080", 120);
        //Monitor m2 =new Monitor("piros", "1920x1080", 144);
        //Monitor m3 =new Monitor("pink", "1920x1080", 60);

        /*System.out.println(m.getKepfrissites());

        m.setKepfrissites(60);
        System.out.println(m.getKepfrissites());

        System.out.println("m: " + m.toString());*/

        ArrayList<Monitor> monitorok = new ArrayList<>();

        monitorok.add(new Monitor("fekete", "1920x1080", 120));
        monitorok.add(new Monitor("piros", "1920x1080", 144));
        monitorok.add(new Monitor("pink", "1920x1080", 60));
        //System.out.println("monitorok: " + monitorok);

        for(Monitor i : monitorok){                 //i == az adott monitor, a monitorok tulajdonsagaira lehet vele hivatkozni i.szin...
            System.out.println("i: " + i.getKepfrissites());            //csv comma separated values
        }
    }
}