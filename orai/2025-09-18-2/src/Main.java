import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("irja be a pontszamat: ");
        int pontszam= scanner.nextInt();

        if(pontszam <= 39){
            System.out.println("elegtelen.");
        }
        else if(pontszam <= 54 && pontszam >=40){
            System.out.println("elegseges.");
        }
        else if(pontszam <= 69 && pontszam >= 55){
            System.out.println("kozepes.");
        }
        else if(pontszam <= 84 && pontszam >= 70){
            System.out.println("jo.");
        }
        else if(pontszam <= 100 && pontszam >= 85){
            System.out.println("jeles.");
        }

        else{
            System.out.println("hibas ertek!");
        }
    }
}