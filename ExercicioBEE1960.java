import java.util.Scanner;

public class ExercicioBEE1960 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int N = leitor.nextInt();
        int i = 0;
        while (N > 0) {
            if (N >= vaNum[i]) {
                System.out.print(vaRom[i]);
                N -= vaNum[i];
            } else {
                i++;
            }
        }
        System.out.print("\n");
    }

}