//import java.util.*;
public class Happy_number {
    public static void main(String[] args){
        int n=10;
        int slow=getNext(n);
        int fast=getNext(getNext(n));
        System.out.println(slow+" "+fast);
        while(slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
            System.out.println(slow+" "+fast);
        }
        if(slow ==1 && fast==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static int getNext(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            int sq=digit*digit;
            sum+=sq;
            n/=10;
        }
        return sum;
    }
    
}
