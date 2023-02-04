/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:55
 * @class Ellipse
 */
public class Ellipse implements IFigure {
    private double firstSemiaxis;
    private double secondSemiaxis;

    public Ellipse() {
    }

    public Ellipse(double firstSemiaxis, double secondSemiaxis) {
        this.firstSemiaxis = firstSemiaxis;
        this.secondSemiaxis = secondSemiaxis;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "firstSemiaxis=" + firstSemiaxis +
                ", secondSemiaxis=" + secondSemiaxis +
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
