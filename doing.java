// Encrypt and decrypt functions
import java.util.Arrays;
import java.util.Scanner;

public class doing {
    public static void encryption() { // Encrypt
        if (settings.showHud) System.out.print("Enter text to encrypt: ");
        Scanner textToEncrypt = new Scanner(System.in);
        variables.operator = textToEncrypt.nextLine();
        variables.originalOperator = variables.operator;
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
        functions.title();
        functions.info();
        if (settings.showHud) System.out.print("Encrypted text: ");
        System.out.println(variables.operator);
        System.out.println();
    }

    public static void decryption() { // Decrypt
        if (settings.showHud) System.out.print("Enter text to decrypt: ");
        Scanner textToDecrypt = new Scanner(System.in);
        variables.operator = textToDecrypt.nextLine();
        variables.originalOperator = variables.operator;
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
        functions.title();
        functions.info();
        if (settings.showHud) System.out.print("Decrypted text: ");
        System.out.println(variables.operator);
        System.out.println();
    }
}
