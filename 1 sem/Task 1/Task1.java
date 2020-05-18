import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину стороны квадрата: ");

        double lenght = scanner.nextDouble();
        double r = lenght/2;
        double corner = (area_square(lenght) - area_circle(r)) / 4;
        double total = area_circle(r) + 2 * corner;

        System.out.println("Площадь круга равна: " + total);
    }

    private static double area_circle (double r){
        double s_circle = r * r * Math.PI;
        return s_circle;
    }


    private static double area_square (double lenght){
        double s_square = lenght * lenght;
        return s_square;
    }
}