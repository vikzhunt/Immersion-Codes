package Assignments.assgn1;

import java.util.Scanner;

public class NumberTriplet {
    public static void main(String[] args) {
		Scanner vk = new Scanner(System.in);
		int tc = vk.nextInt();
		while(tc-->0){
		    int n= vk.nextInt();
		    find(n);
		}
	}
	public static void find(int n){
	    if(n<6) System.out.println("NO");
	    else{
	        int i=1;
	        int j=2;
	        int k=n-i-j;
	        while(k%3==0 || j%3==0){
	            j+=1;
	            k-=1;
	        }
	        if(j>=k) System.out.println("NO");
	        else System.out.println("YES\n"+i+" "+j+" "+k);
	    }
	}
}
