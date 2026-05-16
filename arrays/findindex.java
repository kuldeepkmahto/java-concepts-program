package arrays;
// Questions covered (Based index acessing and traversing).
// 1.replace the given number with current.
// 2.print the array element according to conditions.
// 3.sum of even elements.
public class findindex {
    public static void main(String []args){
        int[] arr = {23,45,67,0,67,99,54};
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i <n ;i++){
            if(arr[i] == 0){
                arr[i] = 56;
            }
        }
        for(int j = 0;j<n;j++){
            if(arr[j] % 2 == 0){
                System.out.println(arr[j]);
                sum+=arr[j];
            }
        }
        System.out.println("The sum of Even numbers:"+sum);
        
    }
}
