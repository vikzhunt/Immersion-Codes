package Assignments.assgn2;

public class MissingNumber {
    public static void findTwoMissingNumbers(int arr[], int n){ 
		int x=arr[0]; 
		for (int i=1;i<n-2;i++) x=x^arr[i]; 
		for (int i=1;i<=n;i++) x=x^i; 
		int setbit = x & ~(x-1); 
		int a=0;
        int b=0;
        for (int i=0;i<n-2;i++){ 
			if ((arr[i] & setbit) > 0) a=a^arr[i]; 
			else b=b^arr[i]; 
		} 
		for (int i=1;i<=n;i++){ 
			if ((i & setbit)>0) a=a^i; 
			else b=b^i; 
		}
		System.out.println("Two Missing Numbers are "); 
		System.out.println(a+" "+b); 
	} 
}
