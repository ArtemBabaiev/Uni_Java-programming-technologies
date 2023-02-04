/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 16:09
 * @class ReactangleFactory
 */
public class RectangleFactory {
    public static Rectangle create(double a, double b){
        if (a<=0 || b<=0){
            return null;
        }
        return new Rectangle(a,b);
    }
}
