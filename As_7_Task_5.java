import java.util.Scanner;

public class As_7_Task_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];
        int[] ar_2 = new int[ak];

        int pk , jk, kk = 0;

        boolean maybe = false;

        System.out.println();

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        System.out.println();

        System.out.println("Enter the number : ");
        jk = scan.nextInt();

        for (int j = 0; j < ak; j++) {
            pk = ar_1[j];

            if (pk == jk) {
                maybe = true;
                kk = j;
                break;
            }else{}

        }

        System.out.println();

        if (maybe == true) {
            System.out.println(jk + " is at index " + kk);
        }else if (maybe == false) {
            System.out.println("Element not found .!!");
        }else{}
        

        scan.close();
    }
}
