public class split {
    public static void main(String args[])
    {
        String str = "/////////////";
        String [] arrOfStr = str.split("/");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
