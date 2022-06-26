import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        int digit5 = 0;
        int count = 0;


        while (num > 0){
            count++;
            switch (count) {
                case 1 -> digit1 = num % 10;
                case 2 -> digit2 = num % 10;
                case 3 -> digit3 = num % 10;
                case 4 -> digit4 = num % 10;
                case 5 -> digit5 = num % 10;
            }
            num /= 10;
        }

        switch (count) {
            case 2:
                if (digit1 == digit2) {
                    System.out.print("palindrom");
                } else {
                    System.out.print("ne e palindrom");
                }
                break;
            case 3:
                if (digit1 == digit3) {
                    System.out.print("palindrom");
                } else {
                    System.out.print("ne e palindrom");
                }
                break;
            case 4:
                if (digit1 == digit4 && digit2 == digit3) {
                    System.out.print("palindrom");
                } else {
                    System.out.print("ne e palindrom");
                }
                break;
            case 5:
                if (digit1 == digit5 && digit2 == digit4) {
                    System.out.print("palindrom");
                } else {
                    System.out.print("ne e palindrom");
                }
                break;
        }
    }
}
