import java.util.Base64;

public class Main {

    static String operator;


    static void base64Encrypt() {
        operator = Base64.getEncoder().encodeToString(operator.getBytes());
    }

    static void base64Decrypt() {
        operator = new String(Base64.getDecoder().decode(operator));
    }

    static void cesarEncrypt(int key) {
        char[] chars = operator.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + key);
        }
        operator = new String(chars);
    }

    static void cesarDecrypt(int key) {
        char[] chars = operator.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - key);
        }
        operator = new String(chars);
    }

    public static void main(String[] args) {
        operator = "abc";
        base64Encrypt();
        System.out.println(operator);
    }
}