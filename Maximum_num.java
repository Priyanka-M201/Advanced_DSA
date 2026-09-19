public class Maximum_num{
    public static void main(String[] args){
        int []arr={10,5,20,8,12};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){// to find minimum if(arr[i]<min){ min=arr[i]}
                max=arr[i];
            }
        }
        System.out.println("Maximum number: "+max);
    }
}