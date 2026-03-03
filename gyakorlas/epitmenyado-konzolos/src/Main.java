import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        ArrayList<Ado> epuletek = new ArrayList<>();

        try{
            File fajl = new File("utca.txt");
            Scanner scanner = new Scanner(fajl);

            while(scanner.hasNextLine()){
                String sor = scanner.nextLine();
                String [] adatok = sor.split(";");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
