package Assignments.assgn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public static List<String> AllPossibleStrings(String s){
        List<String> li=new ArrayList<>();
        print(s,li,"");
        Collections.sort(li);
        return li;
    }
    public static void print(String s,List<String> li,String cr){
        if(s.length()==0 && cr.length()>0){
            li.add(cr);
            return;
        }
        if(s.length()>0){
            print(s.substring(1),li,cr);
            print(s.substring(1),li,cr+s.charAt(0));
        }
    }
}
