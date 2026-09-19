import java.util.*;

public class First_Non_repeat_element {
    public static void main(String[] args){
        int [] arr={4, 5, 1, 2, 1, 4, 5};
        HashMap<Integer ,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" ");
                break;
            }
        }
    }
}
