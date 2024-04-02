class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7, 8, 9, 9};
        
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nUnique Numbers:");
        printUniqueNumbers(array);
    }
    
    public static void printUniqueNumbers(int[] array) {
        boolean[] visited = new boolean[array.length];
        
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                boolean isUnique = true;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        isUnique = false;
                        visited[j] = true;
                    }
                }
                if (isUnique) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
