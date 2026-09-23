import java.util.*;
public class Longest_consecutive_sequence {
    public static void main(String[] args){
        int arr[]={9,1,4,7,3,2,6,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int i=0;
        int length=0;
        while(i<arr.length){
            if(!set.contains(arr[i]-1)){
                int current=arr[i];
                int len=1;
                while(set.contains(current+ 1)){
                    current++;
                    len++;
                }
                length=Math.max(length, len);
            }
            i++;
        }
        System.out.println(length);
    }
}
