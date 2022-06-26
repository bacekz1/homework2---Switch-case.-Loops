public class Task23 {
    public static void main(String[] args) {

        int digit = 1;
        int multiplier = 1;

        while (digit < 10){
            if (multiplier < 10) {
                System.out.printf("%d*%d;", digit, multiplier);
                multiplier++;
            }
            else {
                System.out.println();
                digit++;
                multiplier = digit;
            }
        }

    }
}
