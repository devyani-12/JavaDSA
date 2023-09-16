import java.util.Scanner;

public class Numbersfromonetofifty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // print num  between 1 to 50 that are not multiples of 3

        int i=0;
        for( i=2;i<50;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }

    }
}
