import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //LACI LOOP
        String szoveg = "Laci";

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + szoveg);
        }

        //Egészítsd ki úgy az előző programot, hogy a program beolvasson a standard bemenetről egy szöveget,
        // majd kérdezze meg a felhasználótól, hogy hány alkalommal szeretné kiíratni a beolvasott szöveget!
        // Az egyes kiíratások után szerepeljen sortörés is!

        System.out.print("irja be a szoveget: ");
        String bemenet = scanner.next();

        System.out.print("hany alkalommal kivanja kiiratni a szoveget? ");
        int szam = scanner.nextInt();

        if(szam != 0){
            for (int i = 0; i < szam; i++) {
                System.out.println(i + "\n" + " " + bemenet);
            }
        }

        //A feladat egy átlagos üzemanyag fogyasztás számoló, fogyasztas = (felhasznalt uzemanyag/megtett tavolsag)*100
        // A program kérje be a megtett távolságot (km)
        // és a felhasznált üzemanyag mennyiségét (liter),
        // majd számolja ki és írja ki a fogyasztást (liter/100km).

        System.out.print("irja be a megtett tavolsagot (km): ");
        int tavolsag = scanner.nextInt();

        System.out.print("irja be az elfogyasztott uzemanyag mennyiseget (liter): ");
        double uzemanyag = scanner.nextDouble();

        double fogyasztas = (uzemanyag/tavolsag)*100;

        System.out.print("a fogyasztas " + fogyasztas + " km volt.");

        //Írj programot, amely beolvassa a standard bemenetről a felhasználó testsúlyát kilogrammban (valós szám),
        // majd kiszámolja és kiírja a konzolra, hogy naponta mennyi fehérjét kell elfogyasztania!
        //A program kérje be a felhasználótól, hogy az előző kategóriák közül melyik jellemzi leginkább az életmódját (1-3-ig terjedő egész szám)!

        System.out.println("\n irja be a testsulyat (kg): ");
        double testsuly = scanner.nextDouble();
        if(testsuly > 0){
            System.out.print("a felvitt testsuly: " + testsuly);
        }

        System.out.println("irja be mi jellemzi leginkabb eletmodjat (1-2-3): ");
        int eletmod = scanner.nextInt();

        double feherje = 0;
        if(eletmod == 1){
            feherje = testsuly * 0.8;
            System.out.print("a napi feherjebevitel idealisan: " + feherje + "gramm.");
        }
        if(eletmod == 2){
            feherje = testsuly * 1.2;
            System.out.print("a napi feherjebevitel idealisan: " + feherje + "gramm.");
        }
        if(eletmod == 3){
            feherje = testsuly * 2.0;
            System.out.print("a napi feherjebevitel idealisan: " + feherje + "gramm.");
        }

        //Írj programot, amely kiírja a konzolra a szorzótáblát 1-től 10-ig, ciklusok használatával!
        System.out.println();
        for (int i = 1; i <= 10; i++) { //sorok
            for (int j = 1; j <= 10; j++) { //oszlopok
                System.out.print(i * j + "\t");
            }
            System.out.println(); //minden sor utan ujba kezdje irni
        }

        //bonusz: Írj programot, amely beolvas a standard bemenetről egy valós számot, amely a hőmérsékletet jelöli Celsius fokban!
        // A program döntse el, hogy a beolvasott hőmérséklet fagypont alatti-e vagy sem (a fagypont 0 Celsius fok)!
        System.out.println("adja meg a homersekletet (°C): ");
        double fok = scanner.nextDouble();

        if(fok > 0){
            System.out.println("a beirt homerseklet fagypont feletti.");
        } else if (fok < 0) {
            System.out.println("a beirt homerseklet fagypont alatti.");
        } else if (fok == 0) {
            System.out.println("a beirt homerseklet a fagypont.");
        }
        else{
            System.out.println("a beirt homerseklet ervenytelen!");
        }

        //bonusz2: Írj programot, amely beolvas a standard bemenetről egy egész számot, és kiírja annak a négyzetgyökét!
        // Amennyiben a beolvasott szám negatív, akkor a Negativ szambol nem vonunk negyzetgyokot! szöveget írasd ki!

        System.out.println("irja be a vizsgalni kivant szamot: ");
        int szam1 = scanner.nextInt();

        double negyzetgyok = Math.sqrt(szam1);

        if(szam1 < 0){
            System.out.println("a vizsgalt szam negyzetgyoket nem ertelmezzuk!");
        } else if (szam1 == 0) {
            System.out.println("a vizsgalt szam negyzetgyoke 0.");
        } else if (szam1 >= 2) {
            System.out.println("a vizsgalt szam negyzetgyoke: " + negyzetgyok);
        }


    }
}