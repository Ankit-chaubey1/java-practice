import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String str = "java is great and java is powerful";
        String[] words = str.split(" ");
        
        Map<String, Integer> freq = new HashMap<>();
        
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        freq.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}
