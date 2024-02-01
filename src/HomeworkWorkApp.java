import java.util.Scanner;

public class HomeworkWorkApp {

    public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumber();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("первое значение ");
        int a = scanner.nextInt();
        System.out.print("второе значение ");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum>=0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательна");
        }
        }

        public static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int value = scanner.nextInt();
        if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
        }
    }
    public static void compareNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("a => b");
        }
        else {
            System.out.println("a < b");
        }
    }
}


