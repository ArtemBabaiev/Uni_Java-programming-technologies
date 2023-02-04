import java.lang.reflect.Field;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 7
 * @date 26.03.2022 19:41
 * @class Main
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 8);
        System.out.println(rect.toJSON());
        System.out.println(rect.toXML());
    }

}
