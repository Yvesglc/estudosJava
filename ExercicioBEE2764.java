import java.util.Scanner;

public class ExercicioBEE2764 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String STR = sc.next();
        String DD = STR.split("/")[0];
        String MM = STR.split("/")[1];
        String AA = STR.split("/")[2];
        System.out.printf("%s/%s/%s\n", MM, DD, AA);
        System.out.printf("%s/%s/%s\n", AA, MM, DD);
        System.out.printf("%s-%s-%s\n", DD, MM, AA);
    }

}