import java.util.*;
public class Greater_num_right {
    public static void main(String[] args){
        int arr[]={6,3,8,2,7};
        System.out.println(Arrays.toString(greater(arr)));
    }
    public static int[] greater(int [] arr){
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[arr.length];
        //int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
                //i--;
            }
           else{
                ans[i]=stack.peek();
                //i--;
            }
            stack.push(arr[i]);
        }
        return ans;

    }
}
