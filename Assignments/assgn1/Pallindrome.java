package Assignments.assgn1;

public class Pallindrome {
    public static boolean isPalin(int x) {
        String c = Integer.toString(x);
        String d = new StringBuilder(c).reverse().toString();
        return c.equals(d);
    }
}
