import java.util.Scanner;
public class DisturbedPeople {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int[] rooms = new int[n];
        for (int i = 0; i < rooms.length; i++){
            rooms[i] = sc.nextInt();
        }
        for (int i = 1; i < rooms.length - 1; i++){
            if (rooms[i] == 0){
                if (rooms[i-1] == 1 && rooms[i+1] == 1){
                    rooms[i+1] = 0;
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
