public class SLiding_window_1 {
    public static void main(String[] args){
        int arr[]={2,1,5,1,3,2};
        int k=3;
        int right=0;
        int left=0;
        int sum=0;
        int max=0;
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1>k){
                sum-=arr[left];
                left++;
            }
            if(right-left+1==k){
                max=Math.max(sum,max);
            }
            right++;
        }
        System.out.println(max);
    }
}
