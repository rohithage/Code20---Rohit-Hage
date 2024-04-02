class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        
        int result = reverseNumber(number);
        
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + result);
    }
    
    public static int reverseNumber(int number) {
        int result = 0;
        
        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }
        
        return result;
    }
}