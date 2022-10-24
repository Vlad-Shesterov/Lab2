import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в диапазоне от 5 до 10 включительно");
        int userNum = scanner.nextInt();
        scanner.close();

        if(userNum >= 5&& userNum <= 10){
            System.out.println("Правильно! Число входит в диапазон от 5 до 10");
        }else{
            System.out.println("Ошибка! Попробуйте другое число");
        }
    }
}
