package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {

        int  my_salary =50;
        boolean b = !(my_salary > 10 || my_salary<100);
        System.out.println(b);
        // 50 >10 =true
        // 50<100= true
        // (true || true) = True
        // !(true)=false

    }
}
