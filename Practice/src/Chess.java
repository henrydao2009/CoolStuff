import java.util.Scanner;
public class Chess {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String a = in.next();//How to bring whole strings in
        String b = in.next();
        int n1 = a.charAt(0)-b.charAt(0);//Convert letters into numbers
        int n2 = a.charAt(1)- b.charAt(1);
        System.out.println(Math.max(Math.abs(n1), Math.abs(n2))); //Get larger value
        while(n1!=0 || n2!=0){ // != is not equal
            String s ="";
            if(n1>0) {s += "L"; n1--;}
            if(n1<0) {s += "R"; n1++;}
            if(n2>0) {s += "D"; n2--;}
            if(n2<0) {s += "U"; n2++;}
            System.out.println(s);
        }
    }
}




