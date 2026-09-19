public class Palindrome_2pointer {
    public static void main(String[] args){
        int[]arr={1,2,3,2,1};
        int left=0;
        int right=arr.length-1;
        boolean Ispalindrome=true;
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }
            else{
                Ispalindrome=false;
                break;
            }
        }
        if(Ispalindrome){
            System.out.println("It is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
