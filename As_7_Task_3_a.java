import java.util.Scanner;

public class As_7_Task_3_a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];
        int[] ar_2 = new int[ak];

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + ": ");
            ar_1[i] = scan.nextInt();
        }

        System.out.println();

        for (int j = 0; j < ak; j++) {
            ar_2[ak - j - 1] = ar_1[j];
        }

        System.out.println("Reversed array:");
        for (int l = 0; l < ak; l++) {
            System.out.print(ar_2[l] + " ");
        }

        scan.close();
    }
}
