package Assignments.assgn1;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner vk = new Scanner(System.in);
        int n=vk.nextInt();
        if(n%2==0 && n!=2) System.out.println("YES");
        else System.out.println("NO");
        vk.close();
    }
}
