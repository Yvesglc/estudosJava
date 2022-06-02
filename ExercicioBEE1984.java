import java.util.Scanner;

public class ExercicioBEE1984 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = String.valueOf(sc.nextLong());
        String invertido = "";
        for (int i = 0; i < N.length(); i++) {
            invertido += N.charAt(N.length() - i - 1);
        }
        System.out.println(invertido);
    }
}