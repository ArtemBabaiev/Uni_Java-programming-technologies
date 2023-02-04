/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 20.03.2022 19:28
 * @class Rectangle
 */
public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
