import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 100; i < 999 ; i++){
            int digit1 = (i / 100) % 10;
            int digit2 = (i / 10) % 10;
            int digit3 = i % 10;
            if (digit1 + digit2 + digit3 == num){
                System.out.println(i);
            }
        }
    }
}
