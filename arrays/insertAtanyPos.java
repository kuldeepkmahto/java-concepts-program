package arrays;

import java.util.Scanner;
// add the number to given position
public class insertAtanyPos {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,0};
        int size = arr.length-1;
        System.out.println("Enter the index:");
        int index = sc.nextInt();
        shift(arr,index);
        arr[index] = 9;
        int n = size+1;
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void shift(int[] arr, int index){
        int n = arr.length+1;
        for(int i = n - 1;i<=index;i--){
            arr[i] = arr[i+1];
        }
    }
}