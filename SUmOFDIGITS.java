import java.util.Scanner;

/** @noinspection unused*/
public class SUmOFDIGITS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //sum of digits
        int num= sc.nextInt();

        int k=num;
        int sum=0;
        while(k!=0){
            int rem=k%10;
            sum=sum+rem;
            k=k/10;
        }
        System.out.println(sum);



    }


}
