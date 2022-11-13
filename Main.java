import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.print("Enter text: ");
        variables.operator = text.nextLine();
        encrypt.cesar(5);
        encrypt.base64();
        encrypt.cesar(3);
        encrypt.base64();
        encrypt.cesar(6);
        System.out.println(variables.operator);
    }
}