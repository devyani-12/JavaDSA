package ABC2;

import ABC.PublicAccessMod;

public class PublicAccMod {

    public static void main(String[] args) {

        PublicAccessMod obj=new PublicAccessMod();
        System.out.println("Different PAckage,non-child class " + obj.str);

        App3 obj1=new App3();
        obj1.PrintClass();
    }
}

class App3 extends PublicAccessMod{

    void PrintClass(){
        PublicAccessMod obj=new PublicAccessMod();
        System.out.println("Outside Package,Child Class" +obj.str);
    }


}
