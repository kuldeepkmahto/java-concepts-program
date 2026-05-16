import java.util.Arrays;

public class sortZeroRight {
    public static void main(String []args){
        int[] arr = {0,2,31,0,45,0,56,90};
        sortZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortZero(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        for(int i = j; i < n; i++){
            arr[i] = 0;
        }
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
