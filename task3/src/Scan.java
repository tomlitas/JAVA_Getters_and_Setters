import java.util.Scanner;

public class Scan {
    private Scanner sc;
    public Scan(){
        sc = new Scanner(System.in);
    }
    public String getOneString(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }
}
