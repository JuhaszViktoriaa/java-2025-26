import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();

        try{
            File fajl = new File("games-hun.csv");
            Scanner scanner = new Scanner(fajl);

            scanner.nextLine();

            while(scanner.hasNextLine()){
                String sor = scanner.nextLine();
                String[] darabolt = sor.split(",");

                Game g1 = new Game(darabolt[0],
                        darabolt[1],
                        darabolt[2],
                        Integer.parseInt(darabolt[3]),
                        Double.parseDouble(darabolt[4]),
                        Integer.parseInt(darabolt[5]),
                        Integer.parseInt(darabolt[6]),
                        Integer.parseInt(darabolt[7]),
                        Integer.parseInt(darabolt[8])
                        );

                Game g2 = new Game(darabolt);

                //System.out.println("g1 = " + g1);
                //System.out.println("g2 = " + g2);

                games.add(g2);
            }
            scanner.close();

            int sum=0;
            for(Game g : games){
                sum+=g.getBevetel();
                System.out.println("g = " + g);
            }
            System.out.println("az osszes bevetel dollarban: " + sum);


        }
        catch (FileNotFoundException e){
            System.out.println("error");
        }

    }
}