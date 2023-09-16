import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //SI=P*R*T/100;

        System.out.println("Enter the value of P");
//        int P // nahi lenge bcz interest can be in points also.

        float P=sc.nextFloat();   //nextFloat is used to take float as input.

        System.out.println("Enter the value of R");

        float R=sc.nextFloat();

        System.out.println("Enter the value of T");

        float T=sc.nextFloat();

        float SI=P*R*T/100;
        System.out.println(SI);
    }
}
