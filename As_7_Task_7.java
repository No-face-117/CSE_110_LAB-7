import java.util.Scanner;

public class As_7_Task_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr [] = {23,100,23,56,100};
        int ak = arr.length; int pk = 0;
        int[] ar_2 = new int[ak];

        System.out.println("Input array : ");
        for (int m = 0; m < ak; m++) {
            System.out.print(arr[m] + " ");
        }

        for (int i = 0; i < ak; i++) {
           
            for (int j = i + 1; j < ak; j++) {

                if (arr[i] == arr[j]) {

                    arr[j] = 0;
                    //arr[i] = 0;
                    //break;
                }
            }
        }

        System.out.println();
        System.out.println();

        for (int l = 0; l < ak; l++) {
            if (arr[l] != 0) {
                ar_2[pk++] = arr[l];
            }
            else{}
        }

        System.out.println("New array : ");
        for (int n = 0; n < ak; n++) {
            if (ar_2[n] != 0) {
                System.out.print(ar_2[n] + " ");
            }
            else{}
        }

        scan.close();
    }
}
