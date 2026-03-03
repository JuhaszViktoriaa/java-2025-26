import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //A gimnazista Laci informatikaórán odafigyelés helyett mémeket nézegetett, ezért az informatikatanártól azt a régimódi büntetést kapta, hogy le kell írnia a nevét 100-szor.
        // Írj programot, amely kiírja a konzolra a Laci szöveget 100 alkalommal!
        // Az egyes kiíratások után szerepeljen sortörés is!

        //Egészítsd ki úgy az előző programot, hogy a program beolvasson a standard bemenetről egy szöveget, majd kérdezze meg a felhasználótól, hogy hány alkalommal szeretné kiíratni a beolvasott szöveget!
        // Az egyes kiíratások után szerepeljen sortörés is!

        //Készíts egy programot, amely bekéri egy téglalap oldalainak hosszát, majd kiszámítja és megjeleníti a téglalap területét és kerületét!
        //Bemenet: A téglalap két oldalhossza (valós számok)
        //Kimenet: A téglalap területe és kerülete (valós számok)

        System.out.print("az a oldal hossza: ");
        int a = scanner.nextInt();

        System.out.print("az b oldal hossza: ");
        int b = scanner.nextInt();

        int terulet =0;
        int kerulet =0;

        if((a>0) && (b>0)){
            terulet = a*b;
            kerulet= 2*(a+b);

            System.out.println("a kerulet: " + kerulet);
            System.out.println("a terulet: " + terulet);
        }
        else{
            System.out.print("a teglalap nem valos!");
        }

        //Írj egy programot, amely bekéri a kör sugarát, majd kiszámítja és kiírja a kör területét!
        //Bemenet: A kör sugara (valós szám)
        //Kimenet: A kör területe (valós szám, 2 tizedesjegyre kerekítve)

        System.out.print("a sugar nagysaga: ");
        int sugar = scanner.nextInt();

        int kterulet =0;

        if (sugar >0){
            kterulet= (int) ((sugar*sugar)*Math.PI);

            System.out.println("a kor terulete: " + kterulet);
        }

        //haromszog oldalainak vizsgalata:

        System.out.print("az A oldal nagysaga: ");
        int A = scanner.nextInt();

        System.out.print("az B oldal nagysaga: ");
        int B = scanner.nextInt();

        System.out.print("az C oldal nagysaga: ");
        int C = scanner.nextInt();

        if (A+B>C || A+C>B || B+C>A){
            System.out.println("a haromszog megrajzolhato!");
        }

        else{
            System.out.println("a haromszog nem rajzolhato meg!");
        }

    }
}