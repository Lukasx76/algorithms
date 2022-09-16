import java.util.Arrays;

public class AmountOfSheep {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {

        return sheepTotal - (Arrays.stream(fridayNightCounting).sum() + Arrays.stream(saturdayNightCounting).sum());
    }

    public static void main(String[] args){
        System.out.println(lostSheep(new int[] {1,2}, new int[] {3,4}, 15));
    }
}
