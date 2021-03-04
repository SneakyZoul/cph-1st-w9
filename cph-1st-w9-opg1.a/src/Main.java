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


    public static void printWordsWithDoubleConsunant()throws FileNotFoundException {
//how dió yo make it print alle words with double consunat?
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        String text = scan.nextLine();
        int i = 0;
        boolean found = false;
        for (i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                found = true;
                break;
            }
        }
        System.out.println(text);
    }
}