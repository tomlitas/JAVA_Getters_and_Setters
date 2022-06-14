import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite sveika skaiciu: ");
        int sk = scan.nextInt();
        if (sk%3==0||sk%5==0||sk%7==0){
            System.out.println("Dalinasi");
        }else {
            System.out.println("Nesidalina");
        }


    }
}