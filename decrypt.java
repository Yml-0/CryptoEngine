import java.util.Base64;

    public class decrypt {

        static void base64() {
            variables.operator = new String(Base64.getDecoder().decode(variables.operator));
        }

        static void cesar(int key) {
            char[] chars = variables.operator.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) (chars[i] - key);
            }
            variables.operator = new String(chars);
        }
}
