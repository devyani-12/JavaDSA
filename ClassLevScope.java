public class ClassLevScope {

    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.add());
        System.out.println(obj.sub());
    }
}
class A{

    int a=10; //member var h a n b to inko m iss class k kisi b method me constructor me access kr skti hu.
    int b=20;

    int add(){
        return a+b;

    }

    int sub(){
        return a-b;
    }
}