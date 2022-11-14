import java.util.Base64;

public class encrypt {
    public static void base64() { // This function is used to encrypt the text using base64
        variables.operator = Base64.getEncoder().encodeToString(variables.operator.getBytes());
    }

    public static void cesar(int key) { // This function is used to encrypt the text using cesar
        char[] chars = variables.operator.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + key);
        }
        variables.operator = new String(chars);
    }
}
