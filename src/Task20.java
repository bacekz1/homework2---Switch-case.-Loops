public class Task20 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
           int count = i + 1;

            for (int j = 0; j <10 ; j++) {
                if(count == 10){
                    count = 0;
                }
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
