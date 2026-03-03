public class Main {
    public static void main(String[] args) {
        System.out.println("oop");
        
        //konstruktor: specialis methodus, azert felel, hogy az attributumok jo helyre irodjanak
        //getter - setter is specialis methodus
        
        Monitor m = new Monitor( "fekete",  "1920x1080",  120);
        System.out.println("szin = " + m.getSzin());
        System.out.println("felbontas = " + m.getFelbontas());
        System.out.println("kepfrissites = " + m.getKepfrissites());

        System.out.println("m = " + m);
    }
}