import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 3;
        while (num > 0) {

            if (i % 3 == 0) {
                System.out.print(i);
                num--;
            }
            //fix print problem with  last ','
            if (num > 0 && i % 3 == 0) {
                System.out.print(",");
            }
            i++;
        }
    }
}
