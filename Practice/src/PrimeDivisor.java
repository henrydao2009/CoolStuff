import java.util.Scanner;
public class PrimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                s += (n - i) / 2;
                break;
            }
        }
        System.out.println(s);
    }
}

