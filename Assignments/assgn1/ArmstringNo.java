package Assignments.assgn1;

public class ArmstringNo {
    public static String armstrongNumber(int n){
        int l=(int)Math.log10(n)+1;
        int r=n;
        int s=0;
        while(r!=0){
            int re=r%10;
            s+=Math.pow(re,l);
            r/=10;
        }
        if(s==n) return "Yes";
        else return "No";
    }
}
