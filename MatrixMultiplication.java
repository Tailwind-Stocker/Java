import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.println("enter no. of columns: ");
        int c = sc.nextInt();
        int m1[][] = new int[20][20];
        int m2[][] = new int[20][20];
        System.out.println("Enetr data of Matrix 1: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter data of Matrix 2: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        int res[][] = new int[20][20];
        for (int i = 0; i < r; i++) {
            int x = 0;
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < r; k++) {
                    x += m1[r][k] * m2[k][j];
                }
                res[i][j] = x;
            }
        }
        System.out.println("Resulting matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}