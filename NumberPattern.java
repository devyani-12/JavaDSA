import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
