import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int a = sc.nextInt();
        int x; int y = 0; int result = 0;
        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            result += (x - y)/a;
            y = x + sc.nextInt();
        }
        result += (l - y) / a;
        System.out.println(result);
    }
}