import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author artem
 * @version 1.0
 * @project ТП Java. ЛР 16
 * @date 01.05.2022 15:49
 * @class LogsThread
 */
public class LogsThread extends Thread {

    private String date;

    public LogsThread(String date) {
        this.date = date;
    }


    @Override
    public void run() {
        LogProcessor processor = new LogProcessor();

        try {
            processor.getLogsByDate(date);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
