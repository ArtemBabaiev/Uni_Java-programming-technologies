/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:55
 * @class Parallelogram
 */
public class Parallelogram implements IFigure{
    private double side1;
    private double side2;
    private double angle;

    public Parallelogram(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public Parallelogram() {
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", angle=" + angle +
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
