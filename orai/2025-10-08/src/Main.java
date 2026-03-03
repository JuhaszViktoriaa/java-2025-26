import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hashset");
        Scanner scanner = new Scanner(System.in);
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("Lexus");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        for (String i : cars) {
            System.out.println(i);      //hashset bejarasa
        }
                                    //csak egyetlen egyszer szerepelhet egy elem, ez ellenorizheto a contains()el
        boolean tartalmazza = cars.contains("Volvo");
        System.out.println("tartalmazza = " + tartalmazza); // tartalmazza = true

        cars.remove("Volvo"); //elem torlese
        cars.size();            //hashet merete
        cars.clear();           //hashset kiuritese

        //

        //A HashMap azonban "kulcs/érték" párokban tárolja az elemeket és más típusú indexszel (pl. String) érheti el őket.
        //Az egyik objektum kulcsként (indexként) szolgál egy másik objektumhoz (értékhez). Különböző típusokat tárolhat:
        // Sztringkulcsok + egész értékek, vagy azonos típusú (karakterlánckulcsok és karakterlánc értékek)


    }
}