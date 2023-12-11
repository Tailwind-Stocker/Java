import java.util.Scanner;

class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score > 60){
            System.out.println("Student has passed");
        }else{
            System.out.println("Student has failed");
        }
    }
    
}