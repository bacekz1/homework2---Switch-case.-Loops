import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; num >= i; i++){
            count = count + i;

        }
        System.out.println(count);
    }
}
