package Assignments.assgn2;

public class NextHigherSetBit {
    public static int snoob(int x){
        int r,nxth,rp,nxt = 0;
        if(x>0){
            r=x&-x;
            nxth=x+r;
            rp=x^nxth;
            rp=(rp)/r;
            rp>>=2;
            nxt=nxth | rp;
        }
        return nxt;
    }
}
