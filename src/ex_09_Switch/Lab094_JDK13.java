package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        // JDK > 13
        int iteamCode=006;
        switch (iteamCode){
            case 001,002,003:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");

        }
    }
}
