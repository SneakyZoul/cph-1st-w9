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


    private static void printWordsWithDoubleConsunant(){
//how dió yo make it print alle words with double consunat?
       char [] nonConsonants = {'a','e','i','o','u','y','æ','ø','å','0','1','2','3','4','5','6','7','8','9','.',',',};
       for(int i = 0; i < text.length; i++)
       {
           for(int j = 0; j < text[i].length; j++)
           {
               for(int k = 1; k <text[i][j].length(); k++)
               {
                   if (!(new String(nonConsonants).contains(String.valueOf(text[i][j].charAt(k)))) && text[i][j].charAt(k)== text[i][j].charAt(k-1))
                   {
                       System.out.println(String.format("Word contains double consonant (%c):%s", text[i][j].charAt(k), text[i][j]));
                   }
               }
           }
       } }
}