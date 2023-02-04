import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 16
 * @date 01.05.2022 15:48
 * @class LogProcessor
 */
public class LogProcessor {
    public LogProcessor() {
    }



    public long getLogsByDate(String date) throws IOException {
        Instant start;
        Instant finish;
        start = Instant.now();
        System.out.println(date + " started; Time - " + start.toString());
        long errorsNumber = Files.lines(Paths.get("src/logs.txt"))
                .filter(line -> line.contains("ERROR"))
                .filter(line -> line.contains(date))
                .count();
        finish = Instant.now();
        System.out.println(date + " finished; Time: " + finish.toString());
        //System.out.println("Exec time - " + Duration.between(start, finish).toMillis());
        return errorsNumber;
    }
}
