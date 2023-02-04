import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 5
 * @date 26.023.2022 19:44
 * @class Rectangle
 */
public class Rectangle implements IFigure{
    private double height;
    private double width;
    private String test = "test";

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }



    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getHeight() == rectangle.getHeight() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidth());
    }




    public double getDiagonal(){
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.height,2));
    }

    public boolean isSquare(){
        if (this.height == this.width){
            return true;
        }
        return false;
    }

    public double getAngleBetweenDiagonal(){
        double tanOfAngle = height/width;
        double atanOfAngle = Math.atan(tanOfAngle);
        double angle = Math.PI - 2 * atanOfAngle;
        return angle;
    }

    public double radiusOfOutterCircle(){
        return getDiagonal()/2;
    }

    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

}