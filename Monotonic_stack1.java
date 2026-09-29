import java.util.*;
public class Monotonic_stack1 {
    public static void main(String[] args){
        int arr[]={73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(days(arr)));
    }
    public static int[] days(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
    }
}
