import java.util.Scanner;

public class NL6g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int row = 0; row < num ; row++) {

            for (int col = num - row; col > 0 ; col--) {
                System.out.print(col);
                
            }
            System.out.println();
        }
    }
}
