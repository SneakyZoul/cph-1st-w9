public class Main {

    public static void main(String[] args)
    {
        printIfPalindrome("Den laks skal ned");
    }

    private static void printIfPalindrome(String input)
    {



        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];


        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
    }
}


