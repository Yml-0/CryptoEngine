// Main script for the application
public class Main {
    public static void main(String[] args) {
        functions.title(); // Show title
        functions.whatToDo(); // Ask user what to do
        functions.title();
        functions.keys(); // Get the keys from the user
        functions.title();
        switch (variables.whatToDo) { // Check what to do
            case 1 -> doing.encryption(); // Encrypt
            case 2 -> doing.decryption(); // Decrypt
            default -> { // If the user entered an invalid number
                if (settings.showHud) System.out.println("Invalid option");
            }
        }
    }
}