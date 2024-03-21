
import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Map;
        import java.util.Set;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "grape", "kiwi", "apple", "mango", "orange"};

        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : wordsArray) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
                uniqueWords.add(word);
            }
        }

        System.out.println("Unique Words:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("\nWord Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
