import java.util.Scanner;

public class ExercicioBEE2761 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        float B = sc.nextFloat();
        char C = sc.next().charAt(0);
        String input = sc.nextLine();
        String[] sd = input.split("");
        String D = "";
        for (int i = 1; i < sd.length; i++) D += sd[i];
        System.out.printf("%d%.6f%c%s\n", A, B, C, D);
        System.out.printf("%d\t%.6f\t%c\t%s\n", A, B, C, D);
        System.out.printf("%10d%10.6f%10c%10s\n", A, B, C, D);
    }

}