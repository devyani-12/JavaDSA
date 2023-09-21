import java.util.Scanner;

public class PrameterizedConstructor {
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
        int y= sc.nextInt();
        Algebra obj=new Algebra(x,y); //user input

        int ans=obj.add();
        System.out.println(ans);

        System.out.println(obj.sub());
        System.out.println(obj.mul());

        //obj2 made of same class to pass different values

        Algebra obj2=new Algebra(7,10);

        System.out.println(obj2.add());

        System.out.println(obj2.sub());

        System.out.println(obj2.mul());
    }
}

class Algebra{
    int a;
    int b;
    Algebra(int x,int y){
        System.out.println("Parameterized Constructor Called");
        a=x;
        b=y;
    }

    int add(){
        return  a+b;
    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }
}


