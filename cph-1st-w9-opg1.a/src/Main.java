import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");

            i++;

        }


        printWordsWithDoubleConsunant();

    }


    public static void printWordsWithDoubleConsunant() {
//how dió yo make it print alle words with double consunat?
        System.out.println("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i = 0;
        boolean found = false;
        for (i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("word contain double letter");
        } else
            System.out.println("normal word found");
    }
}