public class Sliding_window_2 {
    public static void main(String[] args){
        int arr[]={2,1,5,1,3,1,2};
        int k=7;
        int right=0;
        int left=0;
        int sum=0;
        int max=0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum<=k){
                int len=right-left+1;
                max=Math.max(len,max);
            }
            right++;
        }
        System.out.println(max);
    }
}
