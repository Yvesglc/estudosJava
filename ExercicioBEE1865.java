import java.util.Scanner;

public class ExercicioBEE1865 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        String nome;
        int N;
        for (int i = 0; i < C; i++) {
            nome = sc.next();
            N = sc.nextInt();
            if (nome.equalsIgnoreCase("thor")) System.out.println("Y");
            else System.out.println("N");
        }
    }

}