import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12
 * @date 20.04.2022 11:56
 * @class Main
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Instant start = Instant.now();
        InOneLine();
        Instant finish = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, finish).toMillis());
        System.out.println("\n*******************************************************************************************/n");

        start = Instant.now();
        NotInOneLine();
        finish = Instant.now();
        System.out.println("Execution time: " + Duration.between(start, finish).toMillis());


    }

    public static void InOneLine() throws IOException {
        Arrays.stream(
                        new String(Files.readAllBytes(Paths.get("C:\\Users\\artem\\OneDrive\\Університет\\ТП Java\\Java_LW_12\\src\\harry.txt")))
                                .replaceAll("[^A-Za-z ]", "")
                                .split(" +"))
                .map(el -> el.toLowerCase(Locale.ROOT))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(10)
                .forEach(group -> System.out.println(group.getKey() + "--" + group.getValue()));


    }

    public static void NotInOneLine() throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\artem\\OneDrive\\Університет\\ТП Java\\Java_LW_12\\src\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ]", "").toLowerCase(Locale.ROOT);

        String[] textByWords = text.split(" +");
        text = null;
        Arrays.sort(textByWords);

        String distinctWordsString = " ";
        for (int i = 0; i < textByWords.length; i++) {
            if (!distinctWordsString.contains(" " + textByWords[i] + " ")) {
                distinctWordsString += textByWords[i] + " ";
            }
        }

        String[] distinctWords;
        distinctWords = distinctWordsString.split("\\s+");
        distinctWordsString = null;


        int[] quantity = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            int quantityOfWord = 0;
            for (int j = 0; j < textByWords.length; j++) {
                if (distinctWords[i].equals(textByWords[j])) {
                    quantityOfWord++;
                }
            }
            quantity[i] = quantityOfWord;
        }

        int n = distinctWords.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++)
                if (quantity[j] > quantity[maxIndex])
                    maxIndex = j;

            int temp = quantity[maxIndex];
            quantity[maxIndex] = quantity[i];
            quantity[i] = temp;
            String tempStr = distinctWords[maxIndex];
            distinctWords[maxIndex] = distinctWords[i];
            distinctWords[i] = tempStr;
        }
        System.out.println("10 the most used words and their frequency:");
        for (int i = 0; i < 10; i++) {

            System.out.println(distinctWords[i] + " - " + quantity[i]);


        }
    }
}

