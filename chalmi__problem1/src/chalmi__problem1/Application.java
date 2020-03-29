package chalmi__problem1;

public class Application {
    
    // Entry point of the program, test the duplicate remover
    public static void main(String[] args) {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("problem1.txt");
        duplicateRemover.write("unique_words.txt");
    }
}
