import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //System.out.print("hello");

        //int szam = 5;
        //double szam2 = 5.67;

        //System.out.println("az elso szam erteke: "+szam);   //sout
        //System.out.println("szam2: " + szam2);             //soutv
        //System.out.println(String.format("az elso szam erteke %d", szam));

        Scanner scanner = new Scanner(System.in);

        //szam beolvasasa:
        //System.out.print("adj meg egy egesz szamot: ");
        //int szam = scanner.nextInt(); //beolvasas, nextdouble a double szamokhoz, nextline stringhez

        //System.out.println("szam = " + szam); //valasz

        //

        //String szoveg = "szoveg";
        //System.out.println("adj meg egy szot: "); // \n mukodik sortoreskent
        //String szoveg = scanner.nextLine();
        //System.out.println("szoveg: "+szoveg);

        //AREMELES

        System.out.println("eredeti ar: ");
        int eredetiar = scanner.nextInt();
        System.out.println("eredetiar " + eredetiar + "volt.");

        System.out.println("aremeles merteke: ");
        double emeles = scanner.nextDouble();

        double ertek = (eredetiar/100)*(100+emeles);
        System.out.println("az alkatresz uj ara: " + ertek);

    }
}
