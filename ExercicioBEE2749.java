public class ExercicioBEE2749 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 39; j++) {

                if (i == 1 || i == 7)
                    System.out.print("-");

                else if (j == 1 || j == 39)
                    System.out.print("|");

                else if (i == 2) {
                    if (j == 2)
                        System.out.print("x = 35");
                    else if (j > 7)
                        System.out.print(" ");
                } else if (i == 4) {
                    if (j == 17)
                        System.out.print("x = 35");
                    else if (j < 17 || j > 22)
                        System.out.print(" ");
                } else if (i == 6) {
                    if (j == 33)
                        System.out.print("x = 35");
                    else if (j < 33)
                        System.out.print(" ");
                } else
                    System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

}