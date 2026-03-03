import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    //juhasz viktoria 2025-09-25 dolgozat

    private static void elsoFeladat() {
        // 1. feladat
        Scanner scanner = new Scanner(System.in);

        System.out.print("az alkatresz jelenlegi ara: ");
        int ar = scanner.nextInt();

        System.out.print("arcsokkentes (szazalekban): ");
        double csokkentes = scanner.nextDouble();

        if (csokkentes <= 0) {
            System.out.print("Hibás százalék!");
        } else {
            double eredmeny = ar / 100 * (100 - csokkentes);
            System.out.println("az alkatresz uj ara: " + eredmeny);
        }
    }

    private static void masodikFeladat() {
        // 2. feladat
        Scanner scanner = new Scanner(System.in);

        System.out.print("az intervallum also vegpontja: ");
        int also = scanner.nextInt();

        System.out.print("az intervallum felso vegpontja: ");
        int felso = scanner.nextInt();
        int osszeg = 0;

        for (int i = also; i <= felso; i++) { // range(also, felso+1, 1)
            if (i % 5 == 0 && i % 2 == 0) {
                osszeg += i;
            }
        }
        System.out.printf("a [%d;%d] intervallumba eso paros ottel oszthato szamok osszege: %d", also, felso, osszeg);
    }

    private static void harmadikFeladat() {
        // 3. feladat
        Scanner scanner = new Scanner(System.in);

        System.out.println("az elso szam: ");
        int elso = scanner.nextInt();

        System.out.println("a masodik szam: ");
        int masodik = scanner.nextInt();

        System.out.println("a muvelet: ");
        String muvelet = scanner.next();

        int eredmeny = 0;

        if (elso >= 1 && masodik >= 1) {
            if (Objects.equals(muvelet, "+")) {
                eredmeny = elso + masodik;
                System.out.println("a valasztott muvelet eredmenye: " + eredmeny);
            } else if (Objects.equals(muvelet, "-")) {
                eredmeny = elso - masodik;
                System.out.println("a valasztott muvelet eredmenye: " + eredmeny);
            } else if (Objects.equals(muvelet, "*")) {
                eredmeny = elso * masodik;
                System.out.println("a valasztott muvelet eredmenye: " + eredmeny);
            } else if (Objects.equals(muvelet, "/")) {
                eredmeny = elso / masodik;
                System.out.println("a valasztott muvelet eredmenye: " + eredmeny);
            } else if (elso == 0) {
                System.out.println("nullaval nem ertelmezunk!");
            } else if (masodik == 0) {
                System.out.println("nullaval nem ertelmezunk!");
            } else {
                System.out.println("a muveleti jel vagy a felvitt szamok nem ertelmezhetoek!");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        //elsoFeladat();
        masodikFeladat();
        //harmadikFeladat();
    }
}