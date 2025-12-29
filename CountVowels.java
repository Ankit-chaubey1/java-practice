import java.util.*;
public class CountVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String store = sc.nextLine();
        store = store.toLowerCase();
        int count = 0;
        for (int i = 0; i < store.length(); i++) {
            if (store.charAt(i) == 'a' || store.charAt(i) == 'e' || store.charAt(i) == 'i' || store.charAt(i) == 'o' || store.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels are: " + count);
    }
}