import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            if (num < 10 || num > 99) {
                System.out.println("opa");
                num = sc.nextInt();
            }
        }
        while (num < 10 || num > 99);


        while (num !=1){
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
            System.out.println(num);

        }
    }
}
