package Assignments.assgn2;

public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int x=0;
        for(int i:nums) x^=i;
        int diff= x&(-x);
        int s=0;
        int u=0;
        for(int i:nums){
            if((i&diff)>0) s^=i;
            else u^=i;
        }
        int[] res={u,s};
        return res;
    }
}
