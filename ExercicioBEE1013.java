import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MaiorAB = (a + b + Math.abs(a - b)) / 2;
        int MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;


        System.out.println(MaiorABC + " eh o maior");
    }
}
