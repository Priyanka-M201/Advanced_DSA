public class Remove_duplicate_2pointer {
    public static void main(String[] args){
        int arr[]={1,1,2,2,3,4,4};
        int i=1;
        int j=0;
        while(i<arr.length){
            if(arr[j]==arr[i]){
                i++;
            }
            else{
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        for(int k=0;k<=j;k++){
            System.out.println(arr[k]+" ");
        }
    }
}
