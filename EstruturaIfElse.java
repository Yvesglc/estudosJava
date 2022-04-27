import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Pár");
        } else {
            System.out.println("Ímpar");
        }
    }
}

