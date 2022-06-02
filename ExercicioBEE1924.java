import java.util.Scanner;

public class ExercicioBEE1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            String curso = sc.nextLine();
            System.out.println(curso);
        }
    }
}