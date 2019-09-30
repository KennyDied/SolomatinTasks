import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = scn.nextInt();

        System.out.println("Введите число B: ");
        int b = scn.nextInt();

        checkOddsAndEvens(a, b);
    }

    public static void checkOddsAndEvens (int a, int b) {

        int sum = 0;
        int n1; //счетчик 1
        int n2; //счетчик 2
        int n3;
        int lastNum;

        for (int i = a; i <= b; i++) {

            n1 = 0;
            n2 = 0;
            n3 = i;

            do {
                lastNum = n3 % 10;
                n3 /= 10;

                if (lastNum % 2 == 0)
                    n1++;
                if (lastNum % 2 == 1)
                    n2++;
                if (n1 == n2) {
                    sum+=i;
                }
            } while (n3 != 0);
        }
        System.out.println(sum);
    }

    public static void Counter (int a, int b) {
       // int sum = checkOddsAndEvens(a, b);
       // System.out.println(sum);
    }
}
