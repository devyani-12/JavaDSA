import java.util.Scanner;

public class ARaiseToB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int answ=1;
        for(int i=1;i<=b;i++){
            answ=a*answ;
        }
        System.out.println(ans);
    }
}
