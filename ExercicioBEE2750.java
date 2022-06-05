public class ExercicioBEE2750 {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 39; j++) {

                if (i == 1 || i == 20 || i == 3)
                    System.out.print("-");

                else if (j == 1 || j == 13 || j == 23 || j == 39)
                    System.out.print("|");

                else if (i == 2) {
                    if (j == 4)
                        System.out.print("decimal");
                    else if (j == 16)
                        System.out.print("octal");
                    else if (j == 26)
                        System.out.print("Hexadecimal");
                    else if (j < 4 || j > 36 || (j > 10 && j < 18) || (j > 21 && j < 26))
                        System.out.print(" ");
                } else {
                    if (j == 8)
                        System.out.print(Integer.toString(i - 4));
                    else if (j == 18)
                        System.out.print(Integer.toOctalString(i - 4));
                    else if (j == 31)
                        System.out.print(Integer.toHexString(i - 4).toUpperCase());
                    else if (!(i > 11 && j == 14) && !(i > 13 && j == 2))
                        System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }

}