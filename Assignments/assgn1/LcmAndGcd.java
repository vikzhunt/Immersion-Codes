package Assignments.assgn1;

public class LcmAndGcd {
    static Long[] lcmAndGcd(Long a,Long b) {
        Long x=a,y=b;
        Long r=x%y;
        Long gcd=(long)0;
        while(r!=0){
            x=y;
            y=r;
            r=x%y;
        }
        gcd=y;
        Long lcm=(a*b)/gcd;
        Long res[]={lcm,gcd};
        return res;
    }
}
