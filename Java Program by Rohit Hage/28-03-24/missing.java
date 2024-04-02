class MissingNumber {
    
    public static int missing(int[] nums) {
        int n = nums.length + 1;
        int totalSum = (n * (n + 1)) / 2; 
        
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num; 
        }
        
        return totalSum - arraySum; 
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; 
        
        int missingNumber = missing(numbers);
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
