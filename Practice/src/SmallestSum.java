import java.util.Scanner;
public class SmallestSum {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sr.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sr.nextInt();
        }
        long sum = 0;
        int odd = 1000000000;
        for (int i = 0; i < n; i++){
            sum = sum + a[i];
            if (a[i] % 2 > 0 && a[i] < odd){
                odd = a[i];
            }
        }
        if (sum % 2 > 0){
            sum = sum - odd;
            System.out.println(sum);
        }
        else {
            System.out.println(sum);
        }
    }
}
