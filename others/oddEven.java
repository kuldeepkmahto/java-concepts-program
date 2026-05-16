public class oddEven{
    public static void main(String []args){
        oddEven obj = new oddEven();
       System.out.println( oddEven.checkNum(45));
    }
    public static boolean checkNum(int a){
        if(a % 2== 0) return true;
        else return false;
    }
}