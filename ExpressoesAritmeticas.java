import java.util.Scanner;

public class ExpressoesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        switch (str) {
            case "one":
                System.out.println("Eim?");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}


