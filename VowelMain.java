import java.util.function.Function;

public class VowelMain {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        // Lambda function to count vowels
        Function<String, Integer> countVowels = s -> {
            int count = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        };

        int vowelCount = countVowels.apply(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
