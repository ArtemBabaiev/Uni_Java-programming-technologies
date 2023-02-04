/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:54
 * @class IsoscelesTriangle
 */
public class IsoscelesTriangle implements IFigure{
    private double basis;
    private double lateral;

    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(double basis, double lateral) {
        this.basis = basis;
        this.lateral = lateral;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "basis=" + basis +
                ", lateral=" + lateral +
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
