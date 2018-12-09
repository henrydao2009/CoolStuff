import java.util.Scanner;
public class Increasing {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]){
        int n = sr.nextInt();
        int d = sr.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sr.nextInt();
        }
        int b = 0;
        for (int i = 1; i < n; i++){
            if (a[i] <= a[i-1]){
           b = b + ((a[i-1]-a[i])/d + 1);
           a[i] = a[i] + d * ((a[i-1]-a[i])/d + 1);}
        }
        System.out.println(b);
    }
}
