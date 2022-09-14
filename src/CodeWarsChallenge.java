import java.util.Arrays;

public class CodeWarsChallenge {

    public static void main(String[] args){

        System.out.println(sum(new int[]{1,3,4,5,6,7,9,190}));

    }
    public static int sum(int[] numbers)
    {
        if (numbers == null) {
            return 0;
        }
        else if (numbers.length == 1 || numbers.length == 0){
            return 0;
        }

        int least = numbers[0];
        int greater = numbers[0];
        int sumOfArr = 0;

        for (int number : numbers) {

            if (number > greater) {
                greater = number;
            } else if (number < least) {
                least = number;
            }

            sumOfArr += number;
        }

        return sumOfArr - (least + greater);
    }
}
