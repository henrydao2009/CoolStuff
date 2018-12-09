import java.util.*;
public class Blackjack {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]){
        int n = sr.nextInt();
        if (n > 10 && n < 20){
            System.out.println("4");
        }
        if (n == 21){
            System.out.println("4");
        }
        if (n == 20){
            System.out.println("15");
        }
        if (n < 11 || n > 21){
            System.out.println("0");
        }
    }
}
