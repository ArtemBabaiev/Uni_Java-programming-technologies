import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Random;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 11
 * @date 13.04.2022 14:30
 * @class TimeMeasurment
 */
public class TimeMeasurment {
    public static long getAssigningTime(List<Integer> list){
        Instant start = Instant.now();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getBeggingInsertTime(List<Integer> list){
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.add(0, i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getMiddleInsertTime(List<Integer> list){
        int middle = list.size()/2;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.add(middle, i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getEndInsertTime(List<Integer> list){
        int end = list.size()-1;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.add(end, i);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getBeggingUpdateTime(List<Integer> list){
        Random rand = new Random();
        int index = 0;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.set(index++, rand.nextInt(100));
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getMiddleUpdateTime(List<Integer> list){
        Random rand = new Random();
        int index = list.size()/2;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.set(index++, rand.nextInt(100));
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getEndUpdateTime(List<Integer> list){
        Random rand = new Random();
        int index = list.size() - 1;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.set(index--, rand.nextInt(100));
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getBeggingDeleteTime(List<Integer> list){
        Random rand = new Random();
        int index = 0;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.remove(index++);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getMiddleDeleteTime(List<Integer> list){
        Random rand = new Random();
        int index = list.size()/2;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.remove(index++);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }

    public static long getEndDeleteTime(List<Integer> list){
        Random rand = new Random();
        int index = list.size() - 1;
        Instant start = Instant.now();
        for (int i = 0; i < 1000; i++) {
            list.remove(index--);
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(list.getClass().getName() + ": " + timeElapsed);
        return timeElapsed;
    }
}
