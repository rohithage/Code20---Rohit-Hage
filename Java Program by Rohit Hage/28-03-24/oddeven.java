class OddEven {
    
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 9, 12, 7, 6, 3, 10};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }
}
