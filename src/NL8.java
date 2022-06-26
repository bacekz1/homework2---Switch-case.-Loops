import java.util.Scanner;

public class NL8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {

            for (int i = 0; i < num/3 ; i++) {
                if ( row == 0 || row == num -1 || row == num/2 ){
                    System.out.print("+===+===+");
                    break;
                }
                System.out.print("|");
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
