import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zodis zodis = new Zodis();
        Scan scan = new Scan();

        //scan.getOneString("Iveskite zodi: ");

        zodis.setZodis(scan.getOneString("Iveskite zodi: "));
        System.out.println("Jusu zodis: " + zodis.getZodis());
        String a = zodis.getZodis();
        String b = "pabaiga";

        if (a == b){
            System.out.println("Pabaiga");
        }else {
            do {
                zodis.setZodis(scan.getOneString("Iveskite zodi: "));
                System.out.println("Jusu zodis: " + zodis.getZodis());
            }while (a.equalsIgnoreCase(b));


        }


    }
}