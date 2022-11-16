import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        functions.whatToDo(); // Ask user what to do
        functions.keys(); // Get the keys from the user
        switch (variables.whatToDo) { // Check what to do
            case 1: { // Encrypt
                if (settings.showHud) System.out.print("Enter text to encrypt: ");
                Scanner textToEncrypt = new Scanner(System.in);
                variables.operator = textToEncrypt.nextLine();
                encrypt.cesar(variables.key1);
                encrypt.base64();
                encrypt.cesar(variables.key2);
                encrypt.base64();
                encrypt.cesar(variables.key3);
                encrypt.base64();
                encrypt.cesar(variables.key4);
                encrypt.base64();
                encrypt.cesar(variables.key5);
                encrypt.base64();
                encrypt.cesar(variables.key6);
                if (settings.showHud) System.out.print("Encrypted text: ");
                System.out.println(variables.operator);
                break;
            }
            case 2: { // Decrypt
                if (settings.showHud) System.out.print("Enter text to decrypt: ");
                Scanner textToDecrypt = new Scanner(System.in);
                variables.operator = textToDecrypt.nextLine();
                decrypt.cesar(variables.key6);
                decrypt.base64();
                decrypt.cesar(variables.key5);
                decrypt.base64();
                decrypt.cesar(variables.key4);
                decrypt.base64();
                decrypt.cesar(variables.key3);
                decrypt.base64();
                decrypt.cesar(variables.key2);
                decrypt.base64();
                decrypt.cesar(variables.key1);
                if (settings.showHud) System.out.print("Decrypted text: ");
                System.out.println(variables.operator);
                break;
            }
            default: {
                if (settings.showHud) System.out.println("Invalid option");
                break;
            }
        }
    }
}