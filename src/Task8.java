import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = num - 1;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                System.out.print(count);
            }
            System.out.println();
            count = count + 2;
        }
    }
}
