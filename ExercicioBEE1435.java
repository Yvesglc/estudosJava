import java.util.Scanner;

public class ExercicioBEE1435 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while ((n = sc.nextInt()) != 0) {
            int[][] newArray = new int[n][n];
            int hn = n / 2;
            if (n % 2 == 1) {
                hn++;
            }
            int a = 0;
            int b = n - 1;

            for (int l = 1; l <= hn; l++) {
                for (int i = a; i <= b; i++) {
                    for (int j = a; j <= b; j++) {
                        newArray[i][j] = l;
                    }
                }
                a++;
                b--;
            }
            for (int[] ints : newArray) {
                for (int j = 0; j < newArray.length; j++) {
                    if (j == 0) System.out.printf("%3d", ints[j]);
                    else System.out.printf(" %3d", ints[j]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}