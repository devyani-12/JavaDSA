import java.util.Scanner;

public class EvenAndDivByThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //num should be div by 2 and 3 (use logical and)
        int n=sc.nextInt();
            if(n%2==0 && n%3==0){
                System.out.println("Ans found " + n);
            }else{
                System.out.println("doesnt exist");
            }

            //to check if num is div by 3 or 5(use logical or)

        int r=sc.nextInt();
            if(r%3==0 || r%5==0){
                System.out.println("Ans is " + r);
            }else{
                System.out.println("not found");
            }
    }
}
