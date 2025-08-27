import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = sc.nextLine();

        System.out.println("Введите слово для поиска:");
        String target = sc.nextLine().trim();

        if (target.isEmpty()) {
            System.out.println("Совпадений: 0");
            return;
        }

        String[] words = text.split("[^\\p{L}\\p{Nd}]+");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) continue;
            if (words[i].equalsIgnoreCase(target)) {
                count++;
            }
        }

        System.out.println("Совпадений: " + count);
    }
}