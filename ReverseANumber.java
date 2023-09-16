import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int k=n;
        int rev=0;
        int rem=0;
        while(k!=0){
            rem=k%10;

            rev=rev*10+rem;
            k=k/10;


        }
        System.out.println(rev);

    }


}
