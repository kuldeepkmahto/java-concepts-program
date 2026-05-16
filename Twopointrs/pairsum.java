package Twopointrs;
public class pairsum { // count pair which is equal to target.
    public static void main(String []args){
        int count = 0;
    int[] arr = {-2,2,3,4,5,7,9};
    int left = 0;
    int right = arr.length - 1;
    int target = 7;
    while(left < right ){
        int sum = arr[left]+arr[right];
        if(sum == target){
            count++;
            left++;
            right--;
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
    }
    System.out.println(count);
    }
}
