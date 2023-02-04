/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:55
 * @class RightTriangle
 */
public class RightTriangle implements IFigure{
    private double a;
    private double b;
    private double c;

    public RightTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public RightTriangle() {
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
