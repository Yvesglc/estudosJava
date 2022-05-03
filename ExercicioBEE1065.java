import java.util.Locale;
import java.util.Scanner;

public class ExercicioBEE1065 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int x = 1, conta = 0;
        float num, media = 0;

        while (x <= 5) {
            num = sc.nextFloat();
            if (num % 2 == 0){
                conta = conta + 1;
                //media = media + num;
            }
            x = x + 1;
        }
        System.out.printf("%d valores pares\n",conta);
        //System.out.printf("%.1f\n",media/conta);
        sc.close();
    }
}