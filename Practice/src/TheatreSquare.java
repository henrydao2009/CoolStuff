import java.util.*;
public class TheatreSquare {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[])
    {
        double n = sr.nextInt();
        double m = sr.nextInt();
        double a = sr.nextInt();
        System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));
    }
}
