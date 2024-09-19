import java.util.Scanner;

public class As_7_Task_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N_1 : ");
        int ak_1 = scan.nextInt();
        System.out.println();

        int[] ar_1 = new int[ak_1];

        for (int i_1 = 0; i_1 < ak_1; i_1++) {
            System.out.println("Enter index " + i_1 + " : ");
            ar_1[i_1] = scan.nextInt();
        }

        System.out.println();

        System.out.println("Enter N_2 : ");
        int ak_2 = scan.nextInt();
        System.out.println();

        int[] ar_2 = new int[ak_2];

        for (int i_2 = 0; i_2 < ak_2; i_2++) {
            System.out.println("Enter index " + i_2 + " : ");
            ar_2[i_2] = scan.nextInt();
        }

        int ari_1, ari_2, pk , jk;

        boolean sub_s = true;

        for (int i_3 = 0; i_3 < ak_1; i_3++) {
           ari_1 = ar_1[i_3];

           for (int i = 0; i < ak_2; i++) {
                ari_2 = ar_2[i];   

                if (ari_2 == ari_1) {
                    sub_s = true;
                }
                else if (ari_2 != ari_1) {
                    sub_s = false;
                }else{}
            }
            
        }

        if (sub_s == true) {
            System.out.println();
            System.out.println("Array 2 is a subset of Array 1.");
        } else if (sub_s == false) {
            System.out.println();
            System.out.println("Array 2 is not a subset of Array 1.");
        }else{}
        

        scan.close();
    }
}
