import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        determinantOfAge(age);
    }

    private static void determinantOfAge(int age) {
        if (age >= 11 && age <= 14) {
            System.out.println(age + " лет");
        } else if (age % 10 >= 5 || age % 10 == 0) {
            System.out.println("Вам " + age + " лет");
        } else if (age % 10 == 1) {
            System.out.println("Вам " + age + " год");
        } else {
            System.out.println("Вам " + age + " года");
        }
    }
}