class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Rotate array left by 1 position
        int temp = array[0];
        for (int i = 1; i < n; i++) {
            array[i - 1] = array[i];
        }
        array[n - 1] = temp;

        // Print the rotated array
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
