import java.util.Scanner;
import java.lang.RuntimeException;

class Voting {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age : ");
            int age = sc.nextInt();
            if(age < 18){
                throw new InvalidAgeException("You are not eligible");
            }else{
                System.out.println("Your are eligible to vote");
            }
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}