import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int day=sc.nextInt() ;
//        switch ( day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Dont exist");
//        }


        int c=2;
        switch (c){
            case 1:
                System.out.println("java");
            case 2:
                System.out.println("python");
            default:
                System.out.println("cpp");
        }
    }
}
