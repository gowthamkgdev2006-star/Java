import java.util.Scanner;

public class PatternSearch {

    public static int countMatchingPatterns(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of patterns: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] patterns = new String[n];

        System.out.println("Enter the patterns:");
        for (int i = 0; i < n; i++) {
            patterns[i] = scanner.nextLine();
        }

        System.out.print("Enter the word: ");
        String word = scanner.nextLine();

        int result = countMatchingPatterns(patterns, word);

        System.out.println("Number of matching patterns: " + result);

        scanner.close();
    }
}
