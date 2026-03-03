import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("array");

        Collections Collections = null;

        ArrayList<String> cars = new ArrayList<String>(); // Új ArrayList object lérehozása
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (String i : cars) {
            System.out.println(i);
        }                           //elemek bejarasa

        Collections.sort(cars);     //array novekvo sorrendben
        System.out.println(cars);

        Collections.sort(cars, Collections.reverseOrder()); //csokkeno sorrend
        System.out.println(cars);

        String min = Collections.min(cars);
        System.out.println("min = " + min);     //min
        String max = Collections.max(cars);        //max

        System.out.println(cars);
        cars.get(0); //elem elerese
        cars.set(0, "Opel"); //elem modositasa
        cars.remove(1); //elem torlese
        cars.clear(); //array kiuritese
        cars.size(); //array hosszanak lekerese


    }
}