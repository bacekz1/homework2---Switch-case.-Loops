import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        do {
            if (num < 1 || num > 999) {
                System.out.println("opa");
                num = sc.nextInt();
            }
        }
        while (num < 1 || num > 999);

        int count = 0;

        while (count < 10) {
            num++;
            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                System.out.print(count + 1 + ":" + num + " ");
                count++;
            }
        }
    }
}
