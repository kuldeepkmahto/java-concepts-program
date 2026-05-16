package arrays;

public class MaximaAndMinima { // find the max and min of the array.
      public static void main(String []args){
        int[] arr = {23,45,67,0,67,99,54};
        int max = 0;
        int min = arr[0];
        for(int  i = 0 ;i < arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println(""+max);
        System.out.println(""+min);
      }
}
