package Assignments.assgn1;

import java.util.Scanner;

public class NumberTriplet {
    public static void main(String[] args) {
        Scanner vk = new Scanner(System.in);
        int tc = vk.nextInt();
        while(tc-->0){
            int n=vk.nextInt();
            if (n<7 || n==9) System.out.println("NO");
            else {
                System.out.println("YES");
                if (n % 3 == 0) System.out.println(1+" "+4+" "+(n-5));
                else if (n % 3 == 1) System.out.println(1+" "+2 +" "+(n-3));
                else System.out.println(2+" "+3+" "+(n-5));
            }
        }
        vk.close();
    }
}
