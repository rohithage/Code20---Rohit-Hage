class WordWithHighestRepeatedLetters {
    public static void main(String[] args) {
        String input1 = "abcdefghij google microsoft";
        String input2 = "cameron blue";

        System.out.println(findWordWithHighestRepeatedLetters(input1)); 
        System.out.println(findWordWithHighestRepeatedLetters(input2)); 
    }

    public static String findWordWithHighestRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        String result = "";
        int maxRepeatedLetters = 0;

        for (String word : words) {
            int[] frequency = new int[26]; 

           
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    frequency[Character.toLowerCase(ch) - 'a']++;
                }
            }

           
            int maxFrequency = 0;
            for (int freq : frequency) {
                maxFrequency = Math.max(maxFrequency, freq);
            }

           
            if (maxFrequency > 1 && maxFrequency > maxRepeatedLetters) {
                result = word;
                maxRepeatedLetters = maxFrequency;
            }
        }

        return result.isEmpty() ? "-1" : result;
    }
}
