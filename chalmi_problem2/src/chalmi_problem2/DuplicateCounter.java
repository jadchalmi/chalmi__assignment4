package chalmi_problem2;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    private Map<String, Integer> wordCounter = new HashMap<>();

    // Open the data file and count the frequency of each word
    public void count(String dataFile) {
        try {
            Scanner inFile = new Scanner(new File(dataFile));
            wordCounter.clear();

            // The map stores all unique words and the frequency
            while (inFile.hasNext()) {
                String word = inFile.next().toLowerCase();

                // Add if new
                if (!wordCounter.containsKey(word)) {
                    wordCounter.put(word, 0);
                }

                // Increment frequency
                wordCounter.put(word, wordCounter.get(word) + 1);
            }

            inFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Write the unique words to the given file
    public void write(String outputFile) {
        try {
            PrintWriter outFile = new PrintWriter(new File(outputFile));

            for (String word : wordCounter.keySet()) {
                outFile.println(word + " was found " + wordCounter.get(word) + " time(s)");
            }

            outFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
