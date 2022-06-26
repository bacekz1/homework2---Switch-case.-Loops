import java.util.Scanner;

public class NL5b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean needLeftSpaces = true;
        boolean needRightSpaces = false;

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                if (col == num / 2 - row) {
                    needLeftSpaces = false;
                }
                if (col == num / 2 + row) {
                    needRightSpaces = true;
                }

                if (row > num / 2) {
                    System.out.print(" ");
                } else {

                    if (needLeftSpaces && col < num / 2 - row || needRightSpaces && col > num / 2 + row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            needLeftSpaces = true;
            needRightSpaces = false;
            System.out.println();
        }
    }
}
