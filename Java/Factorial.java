import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = 1;
        for(int i = 1 ; i <= x ; i++){
            f *= i;
        }
        System.out.println("The Factorial of " + x + "is : " + f);
    }
}
