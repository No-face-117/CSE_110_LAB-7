import java.util.Scanner;

public class As_7_Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];

        // a

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index - " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("The elements of the array are : ");
        System.out.println();

        for (int j = 0; j < ak; j++) {
            System.out.println(j + " : " + ar_1[j]);
        }

        // b

        int[] ar_2 = new int[ak + 1];

        System.out.println();
        System.out.println("Enter another number : ");
        ar_2[ak] = scan.nextInt();

        for (int k = 0; k < ak; k++) {
            ar_2[k] = ar_1[k];
        }

        System.out.println();
        System.out.println("After resizing the array : ");
        System.out.println();

        for (int l = 0; l < ak+1; l++) {
            System.out.print(" " + ar_2[l]);
        }

        scan.close(); 
    }
}