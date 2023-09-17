

import java.util.Scanner;

public class NumRectPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=i;j<=cols;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
