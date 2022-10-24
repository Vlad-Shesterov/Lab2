import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 1000");
        int userNum = scanner.nextInt();
        scanner.close();

        if(userNum >1000){
            System.out.printf("Правильно! Число больше 1000. В введёном вами числе %d тыс.%n", (userNum / 1000));
        }else{
            System.out.printf("Ошибка! Попробуйте другое число.");
        }
    }
}
