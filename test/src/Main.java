
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void a() throws IOException {
    String logsAsString = new String(Files.readAllBytes(Paths.get("src/logs.txt")));
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
    public static void ListString() throws IOException {
        LocalDateTime start = LocalDateTime.now();

        String stringedLogs = new String(Files.readAllBytes(
                Paths.get("src/logs.txt")));

        String[] lines = stringedLogs.split("\n");

        List<String> octList = Arrays.stream(lines)
                .filter(line -> line.contains("2019-10-14"))
                .collect(Collectors.toList());

        String out = "";

        for (int i = 0; i < octList.size(); i++) {
            out += octList.get(i) + "\n";
        }

        Path path = Paths.get("src/logs.txt");

        Files.write(path, out.getBytes(StandardCharsets.UTF_8));

        System.out.println(ChronoUnit.MILLIS.between(start, LocalDateTime.now()));
    }

    public static void StringBuilderMethod() throws IOException {
        LocalDateTime start = LocalDateTime.now();
        final StringBuilder sb = new StringBuilder("");
        Files.lines(Paths.get("src/logs.txt"))
                .filter(line -> line.contains("2019-10-14"))
                .forEach(line -> sb.append(line + "\n"));
        Path path = Paths.get("src/logs.txt");
        String out = "";
        Files.write(path,out.getBytes(StandardCharsets.UTF_8));
        System.out.println(ChronoUnit.MILLIS.between(start, LocalDateTime.now()));
    }

    public static void ScannerMethod() throws FileNotFoundException {
        LocalDateTime start = LocalDateTime.now();
        Scanner scanner =  new Scanner(new File("src/logs.txt"));
        String out = "";
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            if(line.contains("2019-10-14")){
                out += line + "\n";
            }
        }
        System.out.println(ChronoUnit.MILLIS.between(start, LocalDateTime.now()));
    }

    public static void main(String[] args) throws IOException {
        ScannerMethod();

    }
}
