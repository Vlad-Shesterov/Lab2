import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое делется на 3 без остатка");
        int userNum = scanner.nextInt();
        scanner.close();

        if (userNum % 3 == 0) {
            System.out.println("Павильно! Число делется на 3");

        } else {
            System.out.println("Ошибка! Попробуй другое число");
        }
    }
}