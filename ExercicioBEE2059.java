import java.util.Scanner;

public class ExercicioBEE2059 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int escolha = sc.nextInt();
        int jogada1 = sc.nextInt();
        int jogada2 = sc.nextInt();
        int roubou = sc.nextInt();
        int acusa = sc.nextInt();

        if (roubou == 1 && acusa == 0)
            System.out.println("Jogador 1 ganha!");
        else if (roubou == 0 && acusa == 1)
            System.out.println("Jogador 1 ganha!");
        else if (roubou == 1 && acusa == 1)
            System.out.println("Jogador 2 ganha!");
        else if (escolha == 1) {
            if ((jogada1 + jogada2) % 2 == 0)
                System.out.println("Jogador 1 ganha!");
            else
                System.out.println("Jogador 2 ganha!");
        } else if (escolha == 0) {
            if ((jogada1 + jogada2) % 2 != 0)
                System.out.println("Jogador 1 ganha!");
            else
                System.out.println("Jogador 2 ganha!");
        }
        sc.close();
    }
}	