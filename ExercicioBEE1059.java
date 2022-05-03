import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1059 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0){
                System.out.println(num);
            }
            num = num + 1;
        }

        sc.close();
    }
}