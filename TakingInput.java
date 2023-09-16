import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt(); //ek n naam k var me nextInt method k through hum inpt leke store krre h
//                          //sc.nextInt() se hum int ya number input lete h
//        System.out.println("The  number entered is : " + n);


        // taking string as input

//        System.out.println("Enter your name");
//        String s=sc.next();  //sc.next() se sirf ek word hi output kraega no matter input me kitne words ho.
//                                        //to take many words or a line in whole we use sc.nextLine()
//        System.out.println("My name is : " + s);

        System.out.println("Enter your name");
        String st=sc.nextLine();   //to read whole line
        System.out.println("Name is : " + st);
    }
}
