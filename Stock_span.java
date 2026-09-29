import java.util.*;
public class Stock_span {
    public static void main(String[] args){
        int arr[]={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(span(arr)));
    }
    public static int[] span(int arr[]){
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=1;
            }
            else{
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
