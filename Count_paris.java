import java.util.*;
public class Count_paris {
    public static void main(String[] args){
        int arr[]={1,5,7,-1,5,7};
        int target=6;
        int pair=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ans=target-arr[i];
            if(map.containsKey(ans)){
                pair+=map.get(ans);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            System.out.println((arr[i]+" "+ans+" "));
        }
        System.out.println(pair);
    }
}
