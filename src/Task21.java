import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();
            if (num <= 0 || num >= 52) {
                System.out.print("input should be number between 1-51");
            }
        }
        while (num <= 0 || num >= 52);


        while (num < 53) {

            //print new line when card number change for better view
            if ((num - 1) % 4 == 0) {
                System.out.println();
            }

            switch ((num - 1) / 4) {
                case 0 -> System.out.print("2");
                case 1 -> System.out.print("3");
                case 2 -> System.out.print("4");
                case 3 -> System.out.print("5");
                case 4 -> System.out.print("6");
                case 5 -> System.out.print("7");
                case 6 -> System.out.print("8");
                case 7 -> System.out.print("9");
                case 8 -> System.out.print("10");
                case 9 -> System.out.print("vale");
                case 10 -> System.out.print("dama");
                case 11 -> System.out.print("pop");
                case 12 -> System.out.print("aso");
            }

            switch ((num - 1) % 4) {
                case 0 -> System.out.print(" spatiq, ");
                case 1 -> System.out.print(" karo, ");
                case 2 -> System.out.print(" kupa, ");
                case 3 -> System.out.print(" pika, ");
            }
            num++;
        }
    }
}
