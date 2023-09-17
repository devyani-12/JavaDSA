import java.util.Scanner;

public class NumPyramidTriaPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(l);
            }
            for(int k=i-1;k>=1 ;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
