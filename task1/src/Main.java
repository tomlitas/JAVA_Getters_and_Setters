import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new  Scanner(System.in);
        System.out.println("Iveskite Skaiciu: ");
        int sk = scan.nextInt();
        if(sk%2==1){
            System.out.println("Nelyginis");
        }else {
            System.out.println("Lyginis");
        }


    }
}