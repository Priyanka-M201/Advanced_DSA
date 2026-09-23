import java.util.*;
public class Longest_subarray_sum_k {
    public static void main(String[] args){
        int arr[]={10,5,2,7,1,9};
        int k=15;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int right=0;
        int sum=0;
        int length=0;
        while(right<arr.length){
            sum+=arr[right];
            if(map.containsKey(sum-k)){
                int pre=map.get(sum-k);                
                int len=right-pre;
                length=Math.max(length,len);
            }
            else{
                map.put(sum,right);
            }
            right++;
        }
        System.out.println(length);
    }
}
