import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_15
 * @date 24.04.2022 20:10
 * @class Main
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "src/logs.txt";
        Instant start;
        Instant finish;

        start = Instant.now();
        StupidMethod(path);
        finish = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, finish).toMillis());

        start = Instant.now();
        LinesMethod(path);
        finish = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, finish).toMillis());

        start = Instant.now();
        ScannerMethod(path);
        finish = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, finish).toMillis());

        ErrorMethod(path);
        System.out.println("Error method executed");

        TimeMethod(path);
        System.out.println("Time method executed");

    }

    public static void StupidMethod(String logsPath) throws IOException {
        String logsAsString = new String(Files.readAllBytes(Paths.get(logsPath)));
        String[] logs= logsAsString.split("\n");
        logsAsString = null;
        System.gc();
        List<String> resultAsList = Arrays.stream(logs)
                .filter(log -> log.contains("2019-10-13"))
                .collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (String s : resultAsList) {
            result.append(s).append("\n");
        }
        Path path = Paths.get("src/StupidResult.txt");
        Files.write(path, result.toString().getBytes(StandardCharsets.UTF_8));
    }
    public static void LinesMethod(String logsPath) throws IOException{
        final StringBuilder sb = new StringBuilder("");
        Files.lines(Paths.get(logsPath))
                .filter(log -> log.contains("2019-10-13"))
                .forEach(log -> sb.append(log + System.lineSeparator()));
        Path path = Paths.get("src/LinesResult.txt");
        Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
    }
    public static void ScannerMethod(String logsPath) throws IOException {
        Scanner scanner = new Scanner(new File(logsPath));
        String result = "";
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            if (str.contains("2019-10-13")){
                result += str + "\n";
            }

        }
        Path path = Paths.get("src/ScannerResult.txt");
        Files.write(path, result.getBytes(StandardCharsets.UTF_8));
    }

    public static void ErrorMethod(String logsPath) throws IOException{
        final StringBuilder sb = new StringBuilder("");
        Files.lines(Paths.get(logsPath))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + System.lineSeparator()));
        Path path = Paths.get("src/ErrorResult.txt");
        Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
    }

    public static void TimeMethod(String logsPath) throws IOException{
        final StringBuilder sb = new StringBuilder("");
        Files.lines(Paths.get(logsPath))
                .filter(log -> log.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d 0[0-5]:[0-5]\\d:\\d\\d\\.\\d\\d\\d ERROR .*") ||
                        log.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d 06:00:\\d\\d\\.\\d\\d\\d ERROR .*") ||
                        log.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d 1[8-9]:[0-5]\\d:\\d\\d\\.\\d\\d\\d ERROR .*") ||
                        log.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d 2[0-3]:[0-5]\\d:\\d\\d\\.\\d\\d\\d ERROR .*") ||
                        log.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d 24:00:\\d\\d\\.\\d\\d\\d ERROR .*"))

                .forEach(log -> sb.append(log + System.lineSeparator()));
        Path path = Paths.get("src/TimeResult.txt");
        Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
    }
}

