package arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {23,45,67,0,67,99,54};
        int[] newArr = new int[arr.length];
        
        int j = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }

        for(int k = 0; k < newArr.length; k++) {
            System.out.println(newArr[k]);
        }
    }
}