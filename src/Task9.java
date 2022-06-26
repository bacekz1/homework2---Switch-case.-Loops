import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (a >= b && count <= 200) {

            if ((b * b) % 3 == 0) {
                System.out.print("skip 3,");
            } else {
                count = count + (b * b);
                System.out.print(b * b + ",");
            }
            b++;
        }
    }
}
