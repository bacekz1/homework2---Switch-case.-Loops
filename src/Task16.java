import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int m;
        do {
            n = sc.nextInt();
            m = sc.nextInt();
            if (n < 10 || n > 5555 & m < 10 || m > 5555) {
                System.out.println("opa");
            }
        }
        while (n < 10 || n > 5555 & m < 10 || m > 5555);

        if (n > m) {
            int temp;
            temp = n;
            n = m;
            m = temp;
        }

        for (int i = m; i > n; i--) {
            if (i % 50 == 0) {
                System.out.println(i);
            }

        }

    }
}
