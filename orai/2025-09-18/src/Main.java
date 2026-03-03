import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("add meg a csoki gyartasi sorszamat: ");
        int gyartasiszam = scanner.nextInt();
        boolean prim=true;
        //2-50
        for(int szam=2; szam<gyartasiszam;szam++){
            //System.out.println(szam);
            if(gyartasiszam%szam == 0){
                prim=false;
                break;
            }
        }
        if(prim){
            System.out.println("Gratulalok, nyertel!");
        }
        else{
            System.out.println("Sajnos nem nyert!");
        }
    }
}