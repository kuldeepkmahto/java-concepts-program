package arrays;

public class Deletion {
    public static void main(String []args){
        int[] arr = {1,2,3,4};
        int n = arr.length;
        n--;
        int index = 5;
        for(int a = index;a<n;a++){
            arr[a] = arr[a+1];
        }
        n--;
        for(int i = 0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
