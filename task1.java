import java.util.Scanner;

public class task1 {

    static String numberComparison(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        }
        return "a = b";
    }

    // “ак как в задании не указано каким образом стоит сделать вычитание
    // смею предположить, что стоит отнимать меньшее от большего
    static int numberSubtraction(int a, int b) {
        if (a > b) {
            return (a - b);
        }
        return (b - a);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("\n========================");
        System.out.println(numberComparison(a, b));
        System.out.println("Addition result: " + (a + b));
        System.out.println("Subtraction result: " + numberSubtraction(a, b));

        if (b == 0) {
            System.out.println("Division by 0");
        } else {
            System.out.println("Division a/b result: " + (a / b));
        }

        System.out.println("Multiplication result: " + (a * b));
        System.out.println("========================");
    }
}
