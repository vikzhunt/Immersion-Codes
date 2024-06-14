package Assignments.assgn2;

import java.util.HashMap;

public class BitwiseAndZero {
    public static int countTriplets(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            for(int j:nums) map.put((i&j),map.getOrDefault((i&j),0)+1);
        }
        for(int k=0;k<nums.length;++k){
            for(int i:map.keySet()){
                if((nums[k]&i)==0) res+=map.get(i);
            }
        }
        return res;
    }
}
