import java.util.Scanner;

void main() {
    ArrayList<Epitmenyado> epuletek = new ArrayList<>();

    System.out.println("1. feladat: ");
//Olvassa be és tárolja el az utca.txt állományban talált adatokat!
    try {
        File textFile = new File("utca.txt");
        Scanner scanner = new Scanner(textFile);

        while (scanner.hasNextLine()) {
            String sor = scanner.nextLine();
            //System.out.println(sor);
            String[] sorok = sor.split(" ");
            Epitmenyado epulet = new Epitmenyado(sorok);
            epuletek.add(epulet);
        }

        System.out.println("Hány telek adatai találhatók az állományban? \n" + epuletek.size() + " db található.");

//Kérje be egy tulajdonos adószámát, és írassa ki, hogy melyik utcában, milyen házszám alatt van építménye!
//Ha a megadott azonosító nem szerepel, akkor írassa ki a „Nem szerepel az adatállományban.”!

        int input = 68396;
        boolean van = false;

        for (Epitmenyado e : epuletek) {
            if (e.getAdoszam() == input) {
                System.out.println(e.getUtca() + " utca " + e.getHazszam());
                van = true;
            }
        }
        if (!van) {
            System.out.println("Nem szerepel az adatállományban.");
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }

    //Kérje be egy tulajdonos adószámát, és írassa ki, hogy melyik utcában, milyen házszám alatt van építménye!
    //Ha a megadott azonosító nem szerepel, akkor írassa ki a „Nem szerepel az adatállományban.”!

    //Készítsen függvényt ado néven, amely meghatározza egy adott építmény után fizetendő adót!
    //A függvény paraméterlistájában szerepeljen az adósáv és az alapterület, visszaadott értéke pedig legyen a fizetendő adó!

    //Határozza meg, hogy hány építmény esik az egyes adósávokba, és mennyi az adó összege adósávonként!

    //Bár az utcák többé-kevésbé párhuzamosak a tó partjával, az egyes porták távolsága a parttól az utcában nem feltétlenül
    //ugyanannyi. Emiatt néhány utcában egyes telkek eltérő sávba esnek.
    //Listázza ki a képernyőre, hogy melyek azok az utcák, ahol a telkek sávokba sorolását emiatt felül kell vizsgálni!
    //Feltételezheti, hogy minden utcában van legalább két telek.

    //Határozza meg a fizetendő adót tulajdonosonként!
    //A tulajdonos adószámát és a fizetendő összeget írassa ki a mintának megfelelően a fizetendo.txt állományba!
    //Minden tulajdonos adatai új sorban szerepeljenek,
    //a tulajdonos adószámát egy szóközzel elválasztva kövesse az általa fizetendő adó teljes összege.
}