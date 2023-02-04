/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 04.04.2022 8:38
 * @class Square
 */
public class Square implements IFigure{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
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
