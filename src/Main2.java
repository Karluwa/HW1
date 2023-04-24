import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("\t\tКонверетер валют\t\t");
        System.out.println("\t\tВведите количество рублей\t\t");
        double rubAmount = new Scanner(System.in).nextDouble();
        System.out.println("\t\tВведите актуальный курс евро\t\t");
        double eurPrice = new Scanner(System.in).nextDouble();
        System.out.println("\t\tВведите кактуальный курс доллара\t\t");
        double dollPrice = new Scanner(System.in).nextDouble();
        System.out.println(rubAmount + " рублей это " +
                rubAmount/eurPrice + " евро");
        System.out.println(rubAmount + " рублей это " +
                rubAmount/dollPrice + " дол");
    }


}
