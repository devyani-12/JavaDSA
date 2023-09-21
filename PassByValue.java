public class PassByValue {
    static void ChangeValue(int a){  //ye a ek naye memory add pe h jaha pe value ko *100 kia h
                                       //isslie agr hum yaha print krenge to *100 krke value aaegi.
        a=a*100;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a=10;
        System.out.println("before value change " + a);

        ChangeValue(a);  //ye a pass by value hua
        System.out.println("after value change " +a);
    }
}
