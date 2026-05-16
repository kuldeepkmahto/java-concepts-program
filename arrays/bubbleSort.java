package arrays;

public class bubbleSort {
// sorting acending or decending order 
    public static void main (String []args){
        int[] arr = {23,45,67,0,67,99,54};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
            if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k = 0;k<n;k++){
            System.out.print(" "+arr[k]);
        }

    }
}
