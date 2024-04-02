class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello123!@#$";
        String result = removeNonAlphabetic(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing non-alphabetic characters: " + result);
    }

    public static String removeNonAlphabetic(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
