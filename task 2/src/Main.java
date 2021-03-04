import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];


    public static void main(String[] args) throws FileNotFoundException
    {


        printLongestSentence();

    }

    private static void printLongestSentence() throws FileNotFoundException
    {
            String longest = "";
             String[] splitarry = new String[0];
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            splitarry = scan.nextLine().split("\\. ");
            longest = splitarry[0];
            for (String sentence: splitarry)
            {
                if (longest.length() <= sentence.length())
                {
                    longest = sentence;
                }
            }
            i++;

        }
        System.out.println(longest);
    }
}