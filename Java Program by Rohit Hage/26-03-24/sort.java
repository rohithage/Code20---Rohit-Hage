import java.util.Arrays;
import java.util.Collections;


class SortHalfArray {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 3, 8, 4};
        sortHalfArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void sortHalfArray(int[] array) {
        int halfLength = array.length / 2;

       
        Arrays.sort(array, 0, halfLength);

        
        Integer[] secondHalf = new Integer[halfLength];
        for (int i = 0; i < halfLength; i++) {
            secondHalf[i] = array[i + halfLength];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());
        for (int i = 0; i < halfLength; i++) {
            array[i + halfLength] = secondHalf[i];
        }
    }
}