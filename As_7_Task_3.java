import java.util.Scanner;

public class As_7_Task_3 {

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

        // a

        System.out.println();

        for (int j = 0; j < ak; j++) {
            ar_2[ak - j - 1] = ar_1[j];
        }

        System.out.println("Reversed using a new array : ");
        for (int l = 0; l < ak; l++) {
            System.out.print(ar_2[l] + " ");
        }

        // b

        for (int k = 0; k < ak / 2; k++) {
            int temp = ar_1[k];  
            ar_1[k] = ar_1[ak - k - 1];  
            ar_1[ak - k - 1] = temp; 
        }

        System.out.println();
        System.out.println("Reversed the original array : ");

        for (int m = 0; m < ak; m++) {
            System.out.print(ar_1[m] + " ");
        }

        scan.close();
    }
}