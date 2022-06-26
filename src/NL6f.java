import java.util.Scanner;

public class NL6f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //print row
        for (int row = 1; row <= num; row++) {
            //print spaces
            for (int spaces = 0; spaces < num - row; spaces++) {
                System.out.print(" ");
            }
            //print numbers
            for (int col = row; col > 0; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
