import java.util.*;
public class lONGEST_SUBSSTRING_WITHOUT_REPEAT {
    public static void main(String[] args){
        String s="abcdabcbc";
        HashSet<Character> set=new HashSet<>();
        int right=0;
        int left=0;
        int len=0;
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int l=right-left+1;
            len=Math.max(len,l);
            right++;
        }
        System.out.println(len);
    }
}
