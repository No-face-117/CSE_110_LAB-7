import java.util.Scanner;

public class As_7_Task_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();
        System.out.println();

        double[] ar_1 = new double[ak];

        int max_i = 0, min_i = 0;

        double big, small, sum = 0.0, avg;

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextDouble();
        }

        big = small = ar_1[0];

        for (int i = 0; i < ak; i++) {
            if (ar_1[i] > big) {
                big = ar_1[i];
                max_i = i;
            }
            if (ar_1[i] < small) {
                small = ar_1[i];
                min_i = i;
            }
            sum += ar_1[i];
        }
        
        avg = sum / ak;

        System.out.println();
        System.out.println("Maximum element : " + big + " found at index " + max_i);
        System.out.println("Minimum element : " + small + " found at index " + min_i);
        System.out.println("Summation : " + sum);
        System.out.println("Average: " + avg);

        scan.close();
    }
}
