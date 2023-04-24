import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        System.out.println("\t\t\tДобро пожаловать в конвертер температур\t\t\t");
        System.out.println("Введите градусы по Цельсию: ");
        double celsiusCount = new Scanner(System.in).nextDouble();
        int ccof1 = 32;
        double coof2 = 1.8;
        System.out.println(celsiusCount + " градусов по цельсию это: " + (celsiusCount
                * coof2 + ccof1) + " по фарингейту");

    }
}
