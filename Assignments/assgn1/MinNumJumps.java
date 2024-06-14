package Assignments.assgn1;

public class MinNumJumps {
    public static int minJumps(int[] a, int n){
        int sp = a[0];
        int max=a[0],jp = 1;
        if(n==1) return 0;
        if(a[0] == 0) return -1;
        for(int i=1;i<n;i++){
            if(i > max) return -1;
            if(i==n-1) return jp;
            max= Math.max(max, a[i] + i);
            sp--;
            if(sp == 0){
                jp++;
                sp = max-i;
            }
        }
        return jp;
    }   
}
