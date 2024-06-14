package Assignments.assgn1;

public class ReverseInteger {
    public int reverse(int x){
        int rv=0;
        while(x>0){
            int tp = x%10;
            rv =rv*10+tp;
            x =(x-tp)/10;
            if(rv%10!=tp) return 0;
        }
        return rv;
    }
}
