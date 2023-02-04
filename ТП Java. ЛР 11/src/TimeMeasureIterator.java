import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 11
 * @date 13.04.2022 14:00
 * @class TimeMeasureIterator
 */
public class TimeMeasureIterator {

    public static long getAssigningTime(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator();
        Instant start = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            listIterator.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getBeggingInsertTime(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator(0);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getMiddleInsertTime(List<Integer> list){
        int middle = list.size()/2;
        ListIterator<Integer> listIterator = list.listIterator(middle);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getEndInsertTime(List<Integer> list){
        int end = list.size()-1;
        ListIterator<Integer> listIterator = list.listIterator(end);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getBeggingUpdateTime(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator();
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.next();
            listIterator.set(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getMiddleUpdateTime(List<Integer> list){
          int middle = list.size()/2;
        ListIterator<Integer> listIterator = list.listIterator(middle);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.next();
            listIterator.set(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getEndUpdateTime(List<Integer> list){
        int end = list.size()-1;

        ListIterator<Integer> listIterator = list.listIterator(end);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.previous();
            listIterator.set(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getBeggingDeleteTime(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator();
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.next();
            listIterator.remove();
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getMiddleDeleteTime(List<Integer> list){
        int middle = list.size()/2;
        ListIterator<Integer> listIterator = list.listIterator(middle);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.next();
            listIterator.remove();
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
//
    public static long getEndDeleteTime(List<Integer> list){
        int end = list.size()-1;

        ListIterator<Integer> listIterator = list.listIterator(end);
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            listIterator.previous();
            listIterator.remove();
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
}
