import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //to read a char at a particular index

//        String s=sc.nextLine();
//        System.out.println(s.charAt(1)); //output will be e.

        //to read all characters one by one

        String s1=sc.nextLine();
        for(int i=0;i<s1.length();i++){
            System.out.println(i + "-" + s1.charAt(i));

        }



    }
}
