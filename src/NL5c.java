import java.util.Scanner;

public class NL5c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean needMoreLeftSpaces = true;
        boolean needMoreRightSpaces = false;

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                //first half of row loop
                if (num / 2 > row) {
                    if (col == num / 2 - row) {
                        needMoreLeftSpaces = false;
                    }
                    if (col == num / 2 + row) {
                        needMoreRightSpaces = true;
                    }

                    if (needMoreLeftSpaces && col < num / 2 - row || needMoreRightSpaces && col > num / 2 + row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
                //second half of row loop
                else {
                    if (col == row - num / 2) {
                        needMoreLeftSpaces = false;
                    }

                    if (col == num - (row - num / 2)) {
                        needMoreRightSpaces = true;
                    }

                    if (needMoreLeftSpaces && col < row - num / 2 || needMoreRightSpaces && col >= num - (row - num / 2)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
            needMoreLeftSpaces = true;
            needMoreRightSpaces = false;
        }
    }
}
