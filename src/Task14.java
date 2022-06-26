import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            num = sc.nextInt();
            if(num < 10 || num > 200){
                System.out.println("opa");
            }
        }
        while (num < 10 || num > 200);

        for (int i = num; i > 6; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
