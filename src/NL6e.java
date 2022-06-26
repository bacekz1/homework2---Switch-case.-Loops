import java.util.Scanner;

public class NL6e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        //print row
        for (int row = 0; row < num; row++) {
            //print spaces
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            //print numbers
            for (int col = 1; col <= num - row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
