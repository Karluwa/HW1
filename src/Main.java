import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        char c = 'g';
//        char f = 'f';
//        int b = 456555555;
//        int catCatze = 34;
//        int dogHund = 43;
//        float d = 45.5F;
//        String s = "Jane";
//        System.out.println(c + "\n" + f + "\n" + b + "\n" + catCatze
//        + "\n" + dogHund + "\n" + d + "\n" + s);
            System.out.println("\t\t\tWelcome to our Calculator\t\t\t");
            System.out.println("Print first number:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Print second number:");
            double b = new Scanner(System.in).nextDouble();
//            System.out.println("Multiply: " + a + "*" + b + "=" + a*b);
//        System.out.println("Sum: " + a + "+" + b + "=" + (a+b));
        System.out.println("Middle: " + a + "+" + b + "/" + "2" + "=" + ((a+b)/2));
    }
}