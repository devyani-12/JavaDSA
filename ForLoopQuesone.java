import java.util.Scanner;

public class ForLoopQuesone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //print sum of 1st n natural nunbers
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){  //i one se start isslie bcz natural no start from 1
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
