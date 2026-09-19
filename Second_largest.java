public class Second_largest {
    public static void main(String[] args){
        int arr[]={10, 5, 20, 8, 12};
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]>seclar && arr[i]<lar){
                seclar=arr[i];
            }
        }
        System.out.println("largest nummber:"+lar+" Second largest number: "+seclar);
    }
}
