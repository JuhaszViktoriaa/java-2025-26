import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kard> kards = new ArrayList<>();

        try {
            File fajl = new File("star-wars.csv");
            Scanner scanner = new Scanner(fajl);
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String[] darabolt = sor.split(",");

                Kard k = new Kard(darabolt[0], darabolt[1], darabolt[2], Integer.parseInt(darabolt[3]));
                kards.add(k);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // ---------------------------------------------------------------------------------------------------------

        double osszeg = 0;
        double db = kards.size();

        for (Kard k : kards) {
          osszeg += k.getSzam();
        }

        double atl = osszeg/db;
        System.out.println("atlag = " + atl);

        // ---------------------------------------------------------------------------------------------------------

        Kard legkisebb = kards.get(0); // Kard(Anakin Skywalker,Jedi,Kék,20000)

        for (Kard k : kards) {
            if (k.getSzam() < legkisebb.getSzam()) {
                legkisebb = k;
            }
        }

        System.out.println("legkisebb = " + legkisebb);

        // ---------------------------------------------------------------------------------------------------------

        HashMap<String, Integer> szinek = new HashMap<>();

        for (Kard k : kards) {
            String kulcs = k.getSzin();

            if(szinek.containsKey(kulcs)) {
                int ertek = szinek.get(kulcs) + 1;
                szinek.put(kulcs, Integer.valueOf(ertek));
            } else {
                szinek.put(kulcs, Integer.valueOf(1));
            }
        }

        System.out.println("szinek = " + szinek);
    }
}