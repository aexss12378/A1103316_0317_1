import java.util.Scanner;

public class A1103316_0317_1 {
    public static void main(String[] args) {
        //int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 n：");
        int n = scanner.nextInt();
        System.out.print("請輸入 m：");
        int m = scanner.nextInt();
        //int result =n*m;
        int[][] arr= new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i+1)*(j+1);
            }
        }


        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //
    }
}
