/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 17:53
 * @class IsoscelesTrapezoid
 */
public class IsoscelesTrapezoid implements IFigure{
    public double basis1;
    public double basis2;
    public double lateral;

    public IsoscelesTrapezoid(double basis1, double basis2, double lateral) {
        this.basis1 = basis1;
        this.basis2 = basis2;
        this.lateral = lateral;
    }

    public IsoscelesTrapezoid() {
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "basis1=" + basis1 +
                ", basis2=" + basis2 +
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
