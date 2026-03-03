import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            File fajl = new File("adatok.txt");
            Scanner scanner = new Scanner(fajl);

            while(scanner.hasNextLine()){
                System.out.print(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}