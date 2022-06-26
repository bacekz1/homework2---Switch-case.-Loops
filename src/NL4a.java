import java.util.Scanner;

public class NL4a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
