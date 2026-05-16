package Twopointrs;
// 1.find unique numbers.
//2.count duplicate number
//3. duplicate element.

public class duplicatenumber {
    public static void main(String []args){
        int[] arr = {1,23,1,2,31,3,5,4,9};
        int n  = arr.length;
        int left = 0;
        int right = n - 1;
        int count = 0;
        while(left<right){
           if(arr[left] !=  arr[right]){
            System.out.println(arr[left]);
           }if else(arr[left] == arr[right]){
            left++;
            count++;
           }else{
            right++;
           }
        }
        System.out.println();

    }
}
