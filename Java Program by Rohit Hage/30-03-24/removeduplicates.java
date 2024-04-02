import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 3};
        
       
        System.out.println("Original Array: " + Arrays.toString(array));
        
      
        int[] result = removeDuplicates(array);
        
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        
        Arrays.sort(array);

      
        int uniqueCount = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                array[uniqueCount++] = array[i];
            }
        }

        
        int[] result = Arrays.copyOf(array, uniqueCount);
        
        return result;
    }
}
