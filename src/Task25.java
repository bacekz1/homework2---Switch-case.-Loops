import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int sum = 1;

        if (num == 0){
            System.out.print(0);
            System.exit(0);
        }

        do {
            if (num > 0) {
                count++;
            }
            else {
                count--;
            }

            sum *= count;
        }
        while (num != count);

        System.out.println(sum);

    }
}
