import java.util.*;
public class DieRoll {
    static Scanner sr = new Scanner(System.in);
    public static void main(String args[]) {
        int a[] = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = sr.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 2; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if (a[1] == 1)
            System.out.println("1/1");
        if (a[1] == 2)
            System.out.println("5/6");
        if (a[1] == 3)
            System.out.println("2/3");
        if (a[1] == 4)
            System.out.println("1/2");
        if (a[1] == 5)
            System.out.println("1/3");
        if (a[1] == 6)
            System.out.println("1/6");
        }
    }

