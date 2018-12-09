import java.util.Scanner;
public class PhoneNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String phone = sc.next();
        int x = 0;
        for (int i = 0; i < phone.length(); i++){
            if (phone.substring(i, i + 1).equals("8")){
                x++;
            }
        }
        if (x > n/11){
            System.out.println(n/11);
        }
        else System.out.println(x);
    }
}
