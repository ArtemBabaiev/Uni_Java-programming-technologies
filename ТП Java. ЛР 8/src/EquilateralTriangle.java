/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:54
 * @class EquilateralTriangle
 */
public class EquilateralTriangle implements IFigure{
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public EquilateralTriangle() {
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideLength=" + sideLength +
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
