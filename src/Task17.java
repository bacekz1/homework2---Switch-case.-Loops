import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char sign = sc.next().charAt(0);

        do {
            if (num < 3 || num > 20) {
                System.out.println("opa");
                num = sc.nextInt();
            }
        }
        while (num < 3 || num > 20);


        for (int row = 1; row <= num; row++) {

            for (int col = 1; col <= num; col++) {

                if (row == 1 || row == num) {
                    System.out.print("*");
                } else {

                    if (col == 1 || col == num) {
                        System.out.print("*");
                    } else {
                        System.out.print(sign);
                    }
                }
            }
            System.out.println();
        }
    }
}
