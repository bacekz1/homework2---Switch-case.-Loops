import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        boolean isPositive = true;

        if (num < 0) {
            num = num * -1;
            isPositive = false;
        }

        do {
            sum += num;
            num--;
        }
        while (num > 0);

        if (isPositive) {
            System.out.println(sum);
        } else {
            System.out.println((sum - 1) * -1);
        }
    }
}
