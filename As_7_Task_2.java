import java.util.Scanner;

public class As_7_Task_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        int ak = arr.length;

        System.out.println("Before removing duplicates:");
        
        for (int i = 0; i < ak; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

        for (int i = 0; i < ak; i++) {
           
            for (int j = i + 1; j < ak; j++) {

                if (arr[i] == arr[j]) {

                    arr[j] = 0;
                }
            }
        }

        System.out.println("After replacing duplicates with 0:");
        System.out.println();

        for (int l = 0; l < ak; l++) {
            System.out.print(arr[l] + " ");
        }

        scan.close();
    }
}
