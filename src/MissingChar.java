import java.util.Arrays;

public class MissingChar {

    public static char findMissingLetter(char[] array)
    {
        char lettersArr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u' , 'v', 'w', 'x', 'y', 'z'};

        Arrays.sort(array);

        char missingChar = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < lettersArr.length; i++){
                if (array[j] != lettersArr[i]){
                    missingChar = lettersArr[i];
                    break;
                }
            }
        }
        return missingChar;
    }

    public static void main(String[] args)
    {
        System.out.println(findMissingLetter(new char[]{ 'O','Q','R','S'}));

    }
}
