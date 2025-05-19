package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course=10;
        float GST = 20.14f;
        //        int total1 = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit
        System.out.println(total); //30
        float total2 = course+GST; // Widening - auto - implicit


//        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2);//30.14



    }
}
