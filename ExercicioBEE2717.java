import java.util.Scanner;

public class ExercicioBEE2717 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt() + sc.nextInt();
        if (A > N)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }

}