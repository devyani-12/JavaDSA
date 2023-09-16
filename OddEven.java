import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // if else
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("num is even");
        }else{
            System.out.println("num is odd");
        }

        //if elif else
        System.out.println("Enter the age of person");
        int age=sc.nextInt();

        if(age<12){
            System.out.println("child");
        }else if(age>=12 && age<=18){
            System.out.println("teenager");
        }else{
            System.out.println("adult");
        }

        //nested if
        System.out.println("Enter the age of person");
        int age1=sc.nextInt();

        if(age1<=12){
            if(age1<5){
                System.out.println("toddler");
            }else{
                System.out.println("child");
            }
        }else if(age1>12 && age1<=18){
            System.out.println("teenage");
        }else{
            System.out.println("adult");
        }

        //ternary operator

         int p=sc.nextInt();
        String ans=(p%2==0)?"even":"odd";
        System.out.println(ans);


    }
}
