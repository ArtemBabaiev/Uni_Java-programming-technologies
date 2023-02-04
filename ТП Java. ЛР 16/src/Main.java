import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 16
 * @date 01.05.2022 15:46
 * @class Main
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Instant start;
        Instant finish;


        start = Instant.now();
        new LogProcessor().getLogsByDate("2019-10-13");
        new LogProcessor().getLogsByDate("2019-10-15");
        new LogProcessor().getLogsByDate("2019-10-17");
        new LogProcessor().getLogsByDate("2019-10-19");
        new LogProcessor().getLogsByDate("2019-10-21");
        finish = Instant.now();
        System.out.println("\nExec time - " + Duration.between(start, finish).toMillis());


        System.out.println("\n************************************************************************\n");
        List<Thread> threads= new ArrayList<Thread>();
        threads.add(new LogsThread("2019-10-13"));
        threads.add(new LogsThread("2019-10-15"));
        threads.add(new LogsThread("2019-10-17"));
        threads.add(new LogsThread("2019-10-19"));
        threads.add(new LogsThread("2019-10-21"));

        start = Instant.now();
        for (Thread t:threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }
        finish = Instant.now();
        System.out.println("\nExec time - " + Duration.between(start, finish).toMillis());

    }
}
