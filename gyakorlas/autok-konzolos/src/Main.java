void main() {
    ArrayList<Car> cars = new ArrayList<>();

    try {
        File fajl = new File("autok.csv");
        Scanner scanner = new Scanner(fajl);
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String sor = scanner.nextLine();
            String[] adatok = sor.split(";");
            Car c = new Car(Integer.parseInt(adatok[0]),
                    adatok[1],
                    adatok[2],
                    Integer.parseInt(adatok[3]),
                    adatok[4],
                    Integer.parseInt(adatok[5]),
                    Integer.parseInt(adatok[6]));
            //System.out.println("c = " + c);
            cars.add(c);
        }
        scanner.close();

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
//----------------------------------------------------------------------------------------------------------------------
    System.out.println("1. feladat: ");
    System.out.println("2. feladat: ");
    System.out.println("3. feladat: ");
    System.out.println("4. feladat: ");

    System.out.println("\n 5. feladat: Határozza meg és írja ki a képernyőre, hány autó adatait tároltuk a forrásfájlban!");
    int hossz = cars.size();
    System.out.println("az adatok szama: " + hossz);

    System.out.println("\n 6. feladat: Számolja meg, hogy a forrásállományban szereplő autók átlagosan hány darabot adtak el, majd jelenítse meg a képernyőn 1 tizedesjegy pontossággal!");
    double atlag = 0;
    double sum = 0;
    for (Car car : cars) {
        sum += car.getDbszam();
    }
    atlag = sum / hossz;
    System.out.printf("az atlagosan eladott darabszam kerekitve: %.1f \n", atlag);

    System.out.println("\n 7. feladat: Írja ki a minta szerint azoknak az autóknak a márkáit és modelljeit, valamint a gyártási évet, amelyeket az elmúlt 5 évben gyártottak.");
    for (Car c : cars) {
        if (c.getGyartasiev() > 2020) {
            System.out.printf("\n -" + c.getMarka() + c.getModell() + ":" + c.getGyartasiev());
        }
    }
    System.out.println("\n 8. feladat: Írassa ki a mintának megfelelően, hogy az egyes márkákhoz hány eladott autó tartozik!");
    for(Car caar : cars){
        if(caar.getDbszam() !=0){
            System.out.printf("\n" + caar.getMarka() + ":" + caar.getDbszam() + " darab.");
        }
    }
}