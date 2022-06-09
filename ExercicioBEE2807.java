import java.util.Scanner;

public class ExercicioBEE2807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ant = 1;
        int prox = 1;
        int atual = 0;
        int[] numbers = new int[N + 10];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < N; i++) {
            atual = ant + prox;
            ant = prox;
            prox = atual;
            numbers[i] = atual;
        }
        sort(numbers, 0, numbers.length - 1);
        for (int i = 0; i < N; i++) {
            if (i < N - 1) System.out.print(numbers[i] + " ");
            else System.out.println(numbers[i]);
        }
    }

    private static void sort(int[] v, int inicio, int fim) {
        int aux, down, up, pivo, i;
        pivo = v[inicio];
        down = inicio;
        up = fim;
        while (down < up) {
            while (v[down] >= pivo && down < fim)
                down++;
            while (v[up] < pivo && up > inicio)
                up--;
            if (down < up) {
                aux = v[down];
                v[down] = v[up];
                v[up] = aux;
            }
        }

        v[inicio] = v[up];
        v[up] = pivo;

        if (inicio < up && inicio != up - 1)
            sort(v, inicio, up - 1);

        if (fim > down && up + 1 != fim)
            sort(v, up + 1, fim);
    }
}
