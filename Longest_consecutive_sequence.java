import java.util.*;
public class Longest_consecutive_sequence {
    public static void main(String[] args){
        int arr[]={9,1,4,7,3,2,6,5};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int i=1;
        int length=0;
        while(i<arr.length){
            if(set.contains(i)){
                length++;
                i++;
            }
            else{
                break;
            }
        }
        System.out.println(length);
    }
}
