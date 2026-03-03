import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ARCSOKKENTES

        System.out.print("eredeti ar: ");
        int eredetiar = scanner.nextInt();
        System.out.println("eredetiar " + eredetiar + " volt.");

        System.out.print("arcsokkentes merteke: ");
        double csokkentes = scanner.nextDouble();

        double ertek = (eredetiar / 100) * (100 - csokkentes);

        System.out.printf("az alkatresz uj ara: %f", ertek);
    }
}