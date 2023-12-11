import java.util.Scanner;

class VowelConsonants {
    public static void main(String[] args) {
        char arr[] = { 'a', 'e', 'i', 'o', 'u' };
        System.out.println("ENter an alphabet: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        bool b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i])
                b = 1;
        }
        if (b == 1) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }
    }
}
