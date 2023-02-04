import com.sun.org.apache.bcel.internal.generic.NEW;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 6
 * @date 21.03.2022 8:47
 * @class Rating
 */
public class Rating {
    private ArrayList<Integer> marks;
    private ArrayList<LocalDate> dates;

    public Rating() {
        marks = new ArrayList<Integer>();
        dates = new ArrayList<LocalDate>();
    }

    public boolean addMark(int mark, Month month, int year){
        for (int i = 0; i < dates.toArray().length; i++) {
            if (dates.get(i).getMonth() == month && dates.get(i).getYear() == year){
                return false;
            }
        }
        LocalDate newDate = LocalDate.of(year, month, 1);
        dates.add(newDate);
        marks.add(mark);
        return true;
    }

    public ArrayList<Integer> getAllMarks() {
        return marks;
    }

    public int getMarkByDate(Month month, int year){
        for (int i = 0; i < dates.toArray().length; i++) {
            if (dates.get(i).getMonth() == month && dates.get(i).getYear() == year){
                return marks.get(i);
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "marks=" + marks +
                ", dates=" + dates +
                '}';
    }
}
