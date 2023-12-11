import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter columns: ");
        int c = sc.nextInt();
        int m1[][] = new int[20][20];
        int m2[][] = new int[20][20];
        System.out.println("Enetr data of Matrix 1: ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter data of Matrix 2: ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of Matrices: ");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                System.out.println(m1[i][j] + m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}