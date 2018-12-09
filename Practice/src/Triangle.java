import java.util.*;
public class Triangle {
        static Scanner sr = new Scanner(System.in);
        public static void main(String args[]){
            int a[]= new int[4];
            for (int i = 0; i < 4; i++){
                a[i] = sr.nextInt();
            }
            for (int i = 0; i < 4; i++){
                for (int j = i + 1; j < 4; j++){
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            if (a[0] + a[1] > a[2] || a[1] + a[2] > a[3]){
                System.out.println("TRIANGLE");
            }
            else if(a[0] + a[1] == a[2] || a[1] + a[2] == a[3]){
                System.out.println("SEGMENT");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }

        }
}
