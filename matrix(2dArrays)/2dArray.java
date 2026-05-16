import java.util.*;
class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][2];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
       
    }
}
