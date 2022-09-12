public class BinarySearch {

    int search(int arr[], int valueToBeFound) {

        int lo = 0;
        int high = arr.length - 1;

        while (lo <= high) {
            int midPoint = lo + (high - lo) / 2;

            if (arr[midPoint] == valueToBeFound) {
                return midPoint;
            } else if (arr[midPoint] < valueToBeFound) {
                lo = midPoint + 1;
            } else {
                high = midPoint - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        BinarySearch object = new BinarySearch();
        int arr[] = {1, 3, 4, 5, 7, 9};
        int valueToBeFound = 3;
        int result = object.search(arr, valueToBeFound);

        if (result == -1) {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element found at "
                    + "index " + result);
    }
    }
}
