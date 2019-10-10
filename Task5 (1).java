import java.util.Scanner;

public class Tassk5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину узора W: ");
        int w = scanner.nextInt();
        drawPicture(w);
    }

    private static void drawPicture(int w) {
        int half = w / 2;
        for (int i = 0; i < w ; i++) {
            System.out.print('*');
        }
        System.out.println();
        for(int i = 0; i < half; i++) {
            for (int j = i; j < half; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(' ');
            }
            for (int j = half - i; j <= half; j++) {
                System.out.print(' ');
            }
            for (int j = i; j < half; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }
}
