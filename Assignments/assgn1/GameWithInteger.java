package Assignments.assgn1;

import java.util.*;
public class GameWithInteger {
    public static void main(String[] args) {
        Scanner vk = new Scanner(System.in);
        int tc=vk.nextInt();
        while(tc-->0){
            int n=vk.nextInt();
            if((n+1)%3==0 || (n-1)%3==0) System.out.println("First");
            else System.out.println("Second");
        }
        vk.close();
    }
}
