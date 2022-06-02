import java.util.Scanner;

public class ExercicioBEE2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort(), cnt = 0, x;
        for (short i = 0; i < 5; i++)
            if (sc.nextInt() == t)
                cnt++;
        System.out.println(cnt);
    }
}