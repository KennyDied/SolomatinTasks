import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scn.nextDouble();
        System.out.print("Введите n: ");
        int n = scn.nextInt();
        System.out.print("Введите e: ");
        double e = scn.nextDouble();

        if (x > -1 && x < 1) {
            sumNTerms(x, n, e);
        } else
            System.out.println("Error");
    }

    private static void sumNTerms(double x, int n, double e) {
        double sumN = 0;
        double term = 0;
        int sumNMoreThanE = 0;
        int sumNMoreThanE10 = 0;
        for (int i = 1; i <= n; i++) {
            term = -1 * Math.pow(x, i) / i;
            sumN += term;
            if (term > e) {
                sumNMoreThanE += term;
                if (term > e / 10) {
                    sumNMoreThanE10 += term;
                }
            }
        }

        System.out.println("Сумма n слагаемых: " + sumN);
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e: " + sumNMoreThanE);
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e/10: " + sumNMoreThanE10);
        System.out.println("Значение функции: " + valueOfFunc(x));
    }

    private static double valueOfFunc(double x) {
        return Math.log(1 - x);
    }
}
