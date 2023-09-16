import java.util.Scanner;

public class Multipleoffivenseven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        int num=1;
        while(true){ //this condition means ki har bar ye loop execute ho and jaise hi ans mile break hojae.
            if(num%5==0 && num%7==0){
                System.out.println("First multiple of five n seven is : " +num);
                break;
            }
            num++;
        }

    }
}
