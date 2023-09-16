import java.util.Scanner;

public class WhileLoopQone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        //print sum of 1st n natural numbers
        int i=1;   //bcz natural numbers start from 1

        int sum=0;
        while(i<=n){

            sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }
}
