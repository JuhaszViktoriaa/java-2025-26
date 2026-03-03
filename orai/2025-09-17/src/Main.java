import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //for (int i = 0; i < 10; i++) {}

        //while(true){} vegtelen while ciklus

        //do{//ciklusmag} while(i<10){}

        //int x=1;
        //x++;     //1    x=2
        //++x;    //3     1+x=...

        //PAROS SZAMOK OSSZEGE:

        System.out.print("az intervallum also vegpontja: ");
        int also = Scanner.nextInt();

        System.out.print("az intervallum felso vegpontja: ");
        int felso = Scanner.nextInt();

        int osszeg=0;

        for(int i=also; i<=felso;i++){
            if(i%2 == 0) {
            osszeg+=i;
            }
        }
        System.out.printf("A(z) [%d; %d] intervallumba eso paros szamok osszege: %d", also, felso, osszeg);
    }
}