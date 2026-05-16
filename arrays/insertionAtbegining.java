package arrays;

import java.util.Arrays;
// add at the beginging 
public class insertionAtbegining {
    public static void main(String []args){
       int[] arr = {1,2,3,4,5,6,7,8};
       int[] newArr = new int[9];
       int index = 0;
      
       for(int i = 0; i < arr.length; i++){
        newArr[i+1] = arr[i];
       }
       newArr[index] = 89;
       for(int j = 0; j < newArr.length; j++){
         System.out.println(newArr[j]);
        }

    }
}
