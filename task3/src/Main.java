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
        printPartOfWord("København", 6, 4);


    }

    private static void printPartOfWord(String word, int index, int part)
    {
        try {
            System.out.println(word.substring(index,index+part));
            }
         catch (StringIndexOutOfBoundsException e)
         {
            if (index > word.length())
            {
                System.out.println("du har fejlet.");
            }
            if (index < word.length())
            {

                System.out.println(word.substring(index));
            }

        }
    }
}





