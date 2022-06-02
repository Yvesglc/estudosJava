import java.util.Scanner;

public class ExercicioBEE2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String alphabet = sc.next();
            String word = "";
            int letters = sc.nextInt();
            for (int i = 0; i < letters; i++) {
                int letter = sc.nextInt() - 1;
                word += alphabet.charAt(letter);
            }
            System.out.println(word);
        }
        sc.close();
    }
}
