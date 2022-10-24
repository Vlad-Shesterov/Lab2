import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое делится на 5 с остатком 2 и на 7 с остатком 1");
        int userNum = scanner.nextInt();
        scanner.close();

        if(userNum %5 == 2&& userNum %7 == 1){
            System.out.println("Правильно! Число делится на 5 с остатком 2 и на 7 с остатком 1");
        }else{
            System.out.println("Ошибка! Попробуй другое число");
        }
    }
}
