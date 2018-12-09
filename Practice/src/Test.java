import java.util.*;
public class Test {
    static Scanner sr = new Scanner(System.in);
    public static void main (String args[]){
        int n = sr.nextInt();
        int d = sr.nextInt();
        int a[] = new int [n];
        int b = 0;
        for (int i = 0; i < n; i++){
            a[i] = sr.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (a[i] <= d){
                b = b + 1;
                a[i] = d + 1;
            }
            else{
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--){
            if (a[i] <= d){
                b = b + 1;
            }
            else{
                break;
            }
        }
        System.out.println(b);
    }
}
