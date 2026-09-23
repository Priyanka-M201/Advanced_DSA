import java.util.*;
public class Sliding_window_3 {
    public static void main(String[] args){
        String s="abcabcbb";
        int len=0;
        HashSet<Character> set=new HashSet<>();
        int right=0;
        int left=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            len=Math.max(len,right-left+1);
             right++;
        }
        System.out.println(len);
    }
}
