import java.util.*;
public class Remove_adjacet_element {
    public static void main(String[] args){
        String s="abbaca";
        System.out.println(ans(s));
    }
    public static String ans(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(stack.peek()==ch){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        String s1="";
        while(!stack.isEmpty()){
            char c=stack.pop();
            s1=s1+String.valueOf(c);
        }
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            s2=s2+String.valueOf(ch);
        }
        return s2;
    }
}
