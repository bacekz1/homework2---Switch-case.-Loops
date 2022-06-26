import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        for (int row = 1; row <= num; row++) {

            for (int spaces = num; spaces > row ; spaces--) {
                System.out.print(" ");
            }
            for (int i = 0; i < row*2 -1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
