package Assignments.assgn1;

public class CoPrime {
    public static int countCoPrime(int a[], int n){
        int ct=0;    
        for(int i=0;i<a.length-1;i++) if(GCD(a[i],a[i+1])!=1) ct++;  
        return ct;
    }
    public static int GCD(int a , int b){
        int gcd=0;
        while(b!=0){
            int tp=b;
            b=a%b;
            a=tp;
        }
        gcd=a;
        return gcd;
    }
}
