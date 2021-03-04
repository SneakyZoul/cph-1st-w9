import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {


        printLongestSentence();

    }

    private static void printLongestSentence() throws FileNotFoundException {

        File file = new File("data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            String[] splitarray = scan.nextLine().split("\\. ");
            i++;

        }
        System.out.println(file);
    }
}