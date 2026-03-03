import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("fajlbairas-olvasas");
        ArrayList<String> adatok = new ArrayList<>();
        /*try {
            FileWriter writer = new FileWriter("txt.txt");
            writer.write("elso sor \n");
            writer.write("masodik sor");
            writer.close();
        } catch (IOException e) {
            System.out.println("e = " + e);
        }*/

        /*try {
            FileWriter w = new FileWriter("txt2.txt");
            for (int i = 0; i < 101; i++) {
                w.write("szamok 1-100ig: " + i +  "\n");
            }
            w.close();
        } catch (IOException e) {
            System.out.println("e = " + e);
        }*/

        File f = new File("txt.txt");
        //System.out.println(f.lastModified());   //https://www.unixtimestamp.com/
        //System.out.println(f.getAbsolutePath());

        Scanner scanner = new Scanner(f); //fajl tartalma keruljon beolvasasra
        while (scanner.hasNextLine()){
            //System.out.println(scanner.nextLine());
            adatok.add(scanner.nextLine());
        }
        scanner.close();
        System.out.println("adatok: " + adatok);
    }
}
