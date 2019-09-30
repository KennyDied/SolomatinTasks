public class Cycle {
    double x0;
    double y0;
    double r;

    public Cycle( double x, double y, double r) {
        this.x0 = x;
        this.y0 = y;
        this.r = r;
    }
    public boolean isIntCycle(double x, double y) {
        double a1 = Math.abs(x - x0);
        double a2 = Math.abs(y - y0);
        double hyp = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2));
        return hyp < r;
    }
}
