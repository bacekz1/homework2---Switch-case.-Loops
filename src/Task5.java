import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

         if (num1 < num2){
             int temp = num1;
             num1 = num2;
             num2 = temp;
         }

        while (num1 >= num2){
            System.out.println(num2);
            num2++;
        }
    }
}
