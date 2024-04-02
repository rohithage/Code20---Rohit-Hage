class Rotate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; 

        System.out.println("Original Array:");
        printArray(array);

        rotateLeftByK(array, k);

        System.out.println("Array after left rotation by " + k + " positions:");
        printArray(array);
    }

    public static void rotateLeftByK(int[] arr, int k) {
        int n = arr.length;
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
