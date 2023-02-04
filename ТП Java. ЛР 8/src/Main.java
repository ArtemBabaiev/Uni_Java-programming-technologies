
/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 7
 * @date 26.03.2022 19:41
 * @class Main
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = RectangleFactory.create(1, 4);
        System.out.println(rect);

        System.out.println(AbstractFigureFactory.create(Figure.SQUARE, 2, 0, 2, 4, 0.25));
    }

}
