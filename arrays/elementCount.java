package arrays;
import java.util.*;
public class elementCount { // to count number element apper in the give array.
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = {1,2,3,4,1,5,6,1,1,6,8,2,3,4};
        System.out.println("Enter the number:");
        int element = sc.nextInt();

        for(int i = 0;i<arr.length;i++){
            if(element == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
