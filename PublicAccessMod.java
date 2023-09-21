package ABC;

public class PublicAccessMod {

    public String str="I Love You";

    void PrintFromClass(){
        System.out.println("Within Class " +str);
    }
    public static void main(String[] args) {
        PublicAccessMod obj=new PublicAccessMod();
        obj.PrintFromClass();
        System.out.println("Within class " +obj.str);

        App2 obj1=new App2();
        obj1.PrintOutsideClass();
    }
}

class App2{

    void PrintOutsideClass(){
        PublicAccessMod obj=new PublicAccessMod();
        System.out.println("Within Package ,Outside Class " +obj.str);
    }
}
