import java.util.Scanner;
public class FrogJumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(k % 2 * a + a *(k / 2) - b * (k / 2));
        }
    }
}
