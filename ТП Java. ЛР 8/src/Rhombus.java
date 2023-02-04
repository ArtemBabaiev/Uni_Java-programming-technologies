/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:52
 * @class Rhombus
 */
public class Rhombus implements IFigure{
    private double side;
    private double angle;

    public Rhombus(double side, double angle) {
        this.side = side;
        this.angle = angle;
    }

    public Rhombus() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "side=" + side +
                ", angle=" + angle +
                '}';
    }
}
