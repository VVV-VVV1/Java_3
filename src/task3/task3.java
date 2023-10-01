package task3;
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        double money, dollar, yuan, euro;
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Options");
        System.out.println("Enter 1: dollar");
        System.out.println("Enter 2: yuan");
        System.out.println("Enter 3: euro");
        System.out.println("\nChoose your option: ");

        x = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        money = sc.nextFloat();
        System.out.println("Your amount is: " + money);

        switch (x) {
            case 1 -> { // Dollar Conversion
                yuan = money * 7.12;
                System.out.println(money + " Dollar = " + yuan + " Yuan");
                euro = money * 1.02;
                System.out.println(money + " Dollar = " + euro + " Euro");
            }
            case 2 -> { // Yuan Conversion
                dollar = money * 0.14;
                System.out.println(money + " Yuan = " + dollar + " Dollar");
                euro = money * 0.14;
                System.out.println(money + " Yuan = " + euro + " Euro");
            }
            case 3 -> { // Euro Conversion
                dollar = money * 0.98;
                System.out.println(money + " Euro = " + dollar + " Dollar");
                yuan = money * 6.98;
                System.out.println(money + " Euro = " + yuan + " Yuan");
            }
            default -> System.out.println("Invalid input");
        }
    }
}