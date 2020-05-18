import java.util.Scanner;

public class Task3 {
    static Cycle c1 = new Cycle (1, -3, 3);
    static Cycle c2 = new Cycle(0,-3,5);
    static VerticalParabola p1 = new VerticalParabola(-3, -3, 0.5 );
    static VerticalParabola p2 = new VerticalParabola(-6,4,-0.25);

    public static SimpleColor getColor(double x, double y) {
        if (p1.isPointUndearopOfParabola(x,y) && !p2.isPointTopopOfParabola(x, y) && !c2.isIntCycle(x, y))
            return SimpleColor.ORANGE;
        if (p2.isPointTopopOfParabola(x, y) && !p1.isPointUndearopOfParabola(x,y) && c1.isIntCycle(x, y))
            return SimpleColor.ORANGE;
        if (p2.isPointTopopOfParabola(x,y) && !p1.isPointUndearopOfParabola(x,y) && !c2.isIntCycle(x, y))
            return SimpleColor.ORANGE;
         if (p2.isPointTopopOfParabola(x, y) && !p1.isPointUndearopOfParabola(x,y) && c2.isIntCycle(x, y)
                && !c1.isIntCycle(x, y))
            return SimpleColor.GREEN;
         if (c1.isIntCycle(x, y) && !p2.isPointTopopOfParabola(x, y) && !p1.isPointUndearopOfParabola(x,y))
            return SimpleColor.GREEN;
        if (p2.isPointTopopOfParabola(x, y) && p1.isPointUndearopOfParabola(x,y) && c1.isIntCycle(x, y))
            return SimpleColor.BLUE;
         if (!c1.isIntCycle(x, y) && !p1.isPointUndearopOfParabola(x,y) && !p2.isPointTopopOfParabola(x, y) && x > -1)
            return SimpleColor.BLUE;
        if (!p2.isPointTopopOfParabola(x, y) && p1.isPointUndearopOfParabola(x,y) && c2.isIntCycle(x, y)
                && !c1.isIntCycle(x, y))
            return SimpleColor.GRAY;
        return SimpleColor.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("Координатам (" + x + "; " + y + ") соответствует цвет: " + getColor(x, y));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X: ");
        double x = in.nextDouble();
        System.out.println("Введите Y: ");
        double y = in.nextDouble();
        printColorForPoint(x, y);
    }
}