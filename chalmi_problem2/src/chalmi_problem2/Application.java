package chalmi_problem2;
public class Application {
    
    // Entry point of the program, test the duplicate remover
    public static void main(String[] args) {
        DuplicateCounter duplicateRemover = new DuplicateCounter();
        duplicateRemover.count("problem2.txt");
        duplicateRemover.write("unique_word_counts.txt");
    }
}
