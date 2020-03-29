package chalmi__problem1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

    private Set<String> uniqueWords = new HashSet<>();

    // Open the data file and store all unique words
    public void remove(String dataFile) {
        try {
            Scanner inFile = new Scanner(new File(dataFile));
            uniqueWords.clear();

            // The set data structure automatically will not allow
            // storing duplicate words
            while (inFile.hasNext()) {
                uniqueWords.add(inFile.next().toLowerCase());
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

            for (String word : uniqueWords) {
                outFile.println(word);
            }

            outFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
