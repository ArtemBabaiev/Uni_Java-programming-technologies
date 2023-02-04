/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 8
 * @date 02.04.2022 16:15
 * @class AbstractFigureFactory
 */
public class AbstractFigureFactory {
    /**
     *     Creates a figure of specified type.
     *     <br>
     *     EQUILATERAL_TRIANGLE, CIRCLE require parameter: a
     *     <br><br>
     *     RECTANGLE, ISOSCELES_TRiANGLE, ELLIPSE require parameter: a, b
     *     <br><br>
     *     RHOMBUS require parameter: a, angle
     *     <br><br>
     *     PARALLELOGRAM,  require parameter: a, b, angle
     *     <br><br>
     *     ISOSCELES_TRAPEZOID, TRiANGLE, RIGHT_TRIANGLE require parameter: a, b, c
     *     <br><br>
     *     TRAPEZE requires parameter: a, b,c,d
     * @param figure Type of Figure
     * @param a First side, basis OR radius for CIRCLE
     * @param b Second side, basis
     * @param c Third side, lateral
     * @param d Forth side, lateral
     * @param angle Value of angle in radians only for RHOMBUS, Parallelogram
     * @return Returns figure of Specified type
     */
    public static IFigure create(Figure figure, double a,double b,double c,double d, double angle){
        switch (figure){
            case RECTANGLE:
                return RectangleFactory.create(a,b);
            case RHOMBUS:
                if (a<=0){
                    return null;
                }
                return new Rhombus(a, angle);
            case TRAPEZE:
                if (Math.abs(d-c) < Math.abs(b-a) && Math.abs(b-a) < d+c){
                    return new Trapeze(a,b,c,d);
                }
                return null;
            case ISOSCELES_TRAPEZOID:
                if (Math.abs(c-c) < Math.abs(b-a) && Math.abs(b-a) < c+c){
                    return new IsoscelesTrapezoid(a,b,c);
                }
                return null;
            case TRIANGLE:
                if ( (a+b<=c) || (b+c<=a) || (a+c<=b) ){
                    return null;
                }
                return new Triangle(a,b,c);
            case ISOSCELES_TRIANGLE:
                if ( (a+b<=b) || (b+b<=a) ){
                    return null;
                }
                return new IsoscelesTriangle(a,b);
            case EQUILATERAL_TRIANGLE:
                if (a<=0){
                    return null;
                }
                return new EquilateralTriangle(a);
            case RIGHT_TRIANGLE:
                boolean isRight = (Math.pow(a, 2) == (Math.pow(c, 2) + Math.pow(b, 2)) ||
                        Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2)) ||
                        Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2)));
                if ( (a+b<=c) || (b+c<=a) || (a+c<=b) || !isRight){
                    return null;
                }
                return new RightTriangle(a,b,c);
            case CIRCLE:
                if (a <= 0){
                    return null;
                }
                return new Circle(a);
            case PARALLELOGRAM:
                if (a <= 0 || b<= 0){
                    return null;
                }
                return new Parallelogram(a,b, angle);
            case ELLIPSE:
                if (a <= 0 || b <= 0){
                    return null;
                }
                return new Ellipse(a,b);
            case SQUARE:
                if (a <= 0){
                    return null;
                }
                return new Square(a);
            default:
                return null;
        }
    }

}
