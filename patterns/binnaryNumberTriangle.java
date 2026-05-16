public class binnaryNumberTriangle{

    public static void main(String []args){
        for(int i = 0 ;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
               
            System.out.print("\n");
        }  
    }
}
