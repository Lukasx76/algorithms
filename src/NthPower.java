public class NthPower {

    public static int modifiedSum(int[] array, int power) {

        int sumArr = 0;
        int sumWithPower = 0;

        for (int j : array) {
            sumWithPower += Math.pow(j, power);
            sumArr += j;
        }

        return sumWithPower - sumArr;
    }

    public static void main(String[] args){
        System.out.println(modifiedSum(new int[] {1,2,3}, 3));

    }
}
