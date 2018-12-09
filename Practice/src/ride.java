/*
ID: henryda1
LANG: JAVA
TASK: ride
 */
import java.io.*;
class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        // Use StringTokenizer vs. readLine/split -- lots faster
        String s1 = f.readLine();
        String s2 = f.readLine();
        if ((compare(s1)) % 47 == (compare(s2)) % 47) {
            out.println("GO");
        } else {
            out.println("STAY");
        }
        out.close();
    }

    private static int compare(String s) {
        s = s.toLowerCase();
        int p = 1;
        for (int i = 0; i < s.length(); i++) {
            p *= (s.charAt(i) - 'a' + 1);
        }
        return p;
    }
}
