import java.util.Scanner;

public class NL4g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 1; row <= num; row++) {
            for (int col = 0; col < num; col++) {
                if (row == 1 || row == num) {
                    System.out.print("#");
                } else {
                    if (col == num - row) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
