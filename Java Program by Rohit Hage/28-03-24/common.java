import java.util.Arrays;

class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("Common Elements:");
        common(array1, array2);
    }

    public static void common(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                System.out.print(array1[i] + " ");
                i++;
                j++;
            }
        }
    }
}
