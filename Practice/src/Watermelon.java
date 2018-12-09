import java.util.*;
public class Watermelon {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]){
        int weight = sr.nextInt();
        if(weight > 2 && weight % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
