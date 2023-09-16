import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //factorial of n
        int n=sc.nextInt();

        int fact=1;  //not 0 bcz fact me multipliction hoti and if anything multiplied to 0 will be 0
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
