import java.util.Scanner;

public class NL6k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {

            for (int leftSide = 1; leftSide <= num - row; leftSide++) {
                if(leftSide == num){
                    break;
                }
                System.out.print(leftSide);
            }
            for (int spaces = 0; spaces < (row*2) - 1; spaces++) {
                System.out.print(" ");
            }

            for (int rightSide = num - row; rightSide > 0 ; rightSide--) {
                System.out.print(rightSide);
            }
            System.out.println();
        }

        
    }
}
