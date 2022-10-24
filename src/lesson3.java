import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число которое делется на 4 и при этом не меньше 10");
        int userNum = scanner.nextInt();
        scanner.close();

        if(userNum %4 == 0&& userNum >= 10){
            System.out.println("Правильно! Число делется на 4 и не меньше 10");
        }else{
            System.out.println("Ошибка! Попробуйте другое число");
        }
    }
}
