import java.util.*;
public class Move_zeros_end {
    public static void main(String[] args){
        int [] arr={0, 1, 0, 3, 12};
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==0){
                i++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
