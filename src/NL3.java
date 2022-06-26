import java.util.Scanner;

public class NL3 {
    public static void main(String[] args) {

        for (int row = 1; row < 10; row++) {
            System.out.print(row + " |");
            for (int multiplier = 1; multiplier < 10; multiplier++) {
                System.out.print(" " + multiplier * row);
            }
            System.out.println();
        }
    }
}
