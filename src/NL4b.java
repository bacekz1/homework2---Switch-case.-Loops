import java.util.Scanner;

public class NL4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int value = num;

        for (int i = 0; i < num; i++) {
            for (int j = value; j > 0  ; j--) {
                System.out.print("$");
            }
            value--;
            System.out.println();
        }

        while (num >= 0){
            for (int i = num; i >= 0 ; i--) {
                System.out.print("#");
            }
            System.out.println();
            num--;
        }



    }
}
