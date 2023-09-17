import java.util.Scanner;

public class AddMethodNonStatic {
    public int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static  void main(String[] args) {
        //when method is non static to uski class ka obj bnega in psvm and then obj .methodname() karke call hoga
        AddMethodNonStatic obj=new AddMethodNonStatic();
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=obj.sum(x,y); //chahe parameters upr a b hai but obj jab bnaya h to obj ki value a b me apne aap
                                  //store hojaegi
        System.out.println(ans);
    }
}
