import java.util.Scanner;

public class ExercicioBEE2176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wifi = sc.nextLine();
        char msg[] = wifi.toCharArray();
        int par=0;

        for (int i=0 ; i<msg.length ; i++)
            if (msg[i]=='1')
                par++;

        if (par%2==0)
            wifi+='0';
        else
            wifi+='1';

        System.out.println(wifi);
        sc.close();
    }

}