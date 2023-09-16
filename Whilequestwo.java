import java.util.Scanner;

public class Whilequestwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //print the sum of numbers until num is -1
        int i=0;
        int sum=0;
        while(i!=-1){
            sum=sum+i;
            i=sc.nextInt();
        }
        System.out.println(sum);
    }
}
