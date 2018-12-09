import java.util.*;
public class Tower {
    static Scanner sr = new Scanner(System.in);
    public static void main (String args[]){
        int n = sr.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sr.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int b = 1;
        int c = 1;
        int h = 1;
        for (int i = 0; i < n - 1; i++){
            if (a[i] == a[i+1]){
                b = b + 1;
                if (b > h) {
                    h = b;
                }
            }
            else{
                c = c + 1;
                b = 1;
            }
        }
        System.out.println(h+" "+c);
    }
}
