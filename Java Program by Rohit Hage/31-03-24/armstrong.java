class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number = 153;
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

      
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

       
        return sum == originalNumber;
    }
}
