public class PracticeQuesOfLEctThirteen {

    public static void temp(int p){
        int q=p;
        q=q-100;
        System.out.println(p);
        System.out.println(q);

    }

    public static void main(String[] args) {
        int p=890;
        temp(p);
        //System.out.println(q); //error bcz method var h of temp or srf temp m hi access ho skta h.
        System.out.println(p);
    }
}
