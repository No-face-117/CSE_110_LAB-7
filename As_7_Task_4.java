import java.util.Scanner;

public class As_7_Task_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];
        int[] ar_2 = new int[ak];

        int pk;

        System.out.println();

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("Original array : ");
        for (int j = 0; j < ak; j++) {
            System.out.print(ar_1[j] + " ");
        }

        for (int k = 0; k < ak; k++) {
            pk = ar_1[k];

            if (pk > 0) {
                ar_1[k] = 1;
            }else if (pk < 0) {
                ar_1[k] = 0;
            }else{}
        }

        System.out.println();
        System.out.println("After modifying : ");
        for (int m = 0; m < ak; m++) {
            System.out.print(ar_1[m] + " ");
        }

        scan.close();
    }
}
