public class AddUsingMethod {
// when method is static

//    when method you create has void to sout ki stat aaegi in method and main me method direct call hoga


//    public static void sum(int a,int b){
//        int SUM=a+b;
//        System.out.println(SUM);
//    }
//
//    public static void main(String[] args) {
//        sum(10,5);
//    }

    //when method created has a return type to method k andr return hoga and main me method call ko kisi me store krke
     // jisme store kia h usse print kaenge main me hi

    public static int SUM_ONE(int c,int d){
        int sum1=c+d;
        return sum1;
    }

    public static void main(String[] args) {
        int ans=SUM_ONE(10,10);
        System.out.println(ans);

    }
}