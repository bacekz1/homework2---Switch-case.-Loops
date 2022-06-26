import java.util.Scanner;

public class NL4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {
            //loop for " "
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            //loop for "#"
            for (int i = 0; i < num - row; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
