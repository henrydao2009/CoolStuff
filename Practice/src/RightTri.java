import java.util.Scanner;
public class RightTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0; i<6; i++)
            arr[i] = in.nextInt();
        if(isRight(arr)) {
            System.out.println("RIGHT");
            return;
        }
        for(int i=0; i<6; i++) {
            arr[i]++;
            if(isRight(arr)) {
                System.out.println("ALMOST");
                return;
            }
            arr[i]-=2;
            if(isRight(arr)) {
                System.out.println("ALMOST");
                return;
            }
            arr[i]++;
        }
        System.out.println("NEITHER");
    }
    static public boolean isRight(int[] arr) {
        if(cal(arr)) return false;
        int[] v = new int[6];
        for(int i=0; i<6; i++) {
            v[i] = arr[(i+2)%6]-arr[i];
        }
        if(v[0]*v[2] + v[1]*v[3] == 0)
            return true;
        if(v[2]*v[4] + v[3]*v[5] == 0)
            return true;
        if(v[0]*v[4] + v[1]*v[5] == 0)
            return true;
        return false;
    }
    public static boolean cal(int[] arr) {
        int a = arr[2]-arr[0];
        int b = arr[3]-arr[1];
        int c = arr[4]-arr[0];
        int d = arr[5]-arr[1];
        if(a*d-b*c == 0)
            return true;
        return false;
    }
}

