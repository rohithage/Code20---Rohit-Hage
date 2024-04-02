class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Hello World";

      
        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
