import java.util.Scanner;

public class DoWhileLoopQuesone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        do{
            System.out.println(num);  //phle ek bar num ki value print hui then condition check hui
                                    //Agr wo 20 se chote h to tab tak values print ho until its less than 20
                                        //and agr num 20 se bda h to ek bar print hoga do ki wajah se n after condition
                                             //check it wont print anything
            num++;
        }while(num<20);
    }
}
