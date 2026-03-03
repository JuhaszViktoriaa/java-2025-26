import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Írj egy egyszerű számológépet, amely a négy alapműveletet (összeadás, kivonás, szorzás, osztás) tudja értelmezni!
        // Olvass be a standard bemenetről két valós számot és egy műveleti jelet (string)! Ha a műveleti jel helyes (tehát a +, -, *, / szimbólumok valamelyike),
        // akkor végezd el a műveletet és írasd ki az eredményt a konzolra!
        // A felsorolt 4 jeltől eltérő műveleti jel esetén írasd ki a Hibas muveleti jel! üzenetet a konzolra!
        // Kezeld le a nullával való osztás esetét is: ha nullával szeretnénk osztani, akkor írasd ki a konzolra az Ejnye, nullaval nem osztunk! hibaüzenetet!"

        System.out.print("az elso szam: ");
        int elso = scanner.nextInt();

        System.out.print("a masdik szam: ");
        int masodik = scanner.nextInt();

        int eredmeny = 0;

        System.out.print("a muveleti jel: ");
        String muvelet = scanner.next();

        if((elso == 0) || (masodik == 0)){
            System.out.println("nullaval nem dolgozunk!");
        }

        if(Objects.equals(muvelet, "+")){
            eredmeny =elso+masodik;
            System.out.println("eredmeny = " + eredmeny);
        }
        if(Objects.equals(muvelet, "-")){
            eredmeny =elso-masodik;
            System.out.println("eredmeny = " + eredmeny);
        }
        if(Objects.equals(muvelet, "*")){
            eredmeny =elso*masodik;
            System.out.println("eredmeny = " + eredmeny);
        }
        if(Objects.equals(muvelet, "/")){
            eredmeny =elso/masodik;
            System.out.println("eredmeny = " + eredmeny);
        }
        if(Objects.equals(muvelet, " ")){
            System.out.print("ertelmezhetetlen a muveleti jel!");
        }

        System.out.printf("A(z) eredmeny %d es a valsztott muvelet: %s", eredmeny, muvelet);

    }
}