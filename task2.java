import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ ������:");
        String a = sc.nextLine();

        System.out.println("������� ������ ������:");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("������ ���������");
        } else {
            System.out.println("������ �����������");
        }
    }
}
