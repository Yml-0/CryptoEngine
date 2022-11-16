import java.util.Scanner;

public class functions {
    public static void whatToDo() { // Ask user what to do
        Scanner whatToDoNum = new Scanner(System.in);
        if (settings.showHud) {
            System.out.println("What do you want to do?");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.print("Enter number: ");
        }
        int choice = whatToDoNum.nextInt();
        switch (choice) {
            case 1:
                variables.whatToDo = 1;
                break;
            case 2:
                variables.whatToDo = 2;
                break;
            default: {
                if (settings.showHud) System.out.println("Invalid number!");
                whatToDo();
                break;
            }
        }

    }

    public static void keys() { // This function is used to get the keys from the user
        int keysChoice = 0;
        Scanner keysScanner = new Scanner(System.in);
        if (settings.abilityChangeKeys) {
            if (settings.showHud) {
                System.out.println("Do you want to use default keys?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Enter number: ");
            }
            keysChoice = keysScanner.nextInt();
        }
        if (keysChoice == 2 && settings.abilityChangeKeys) {
            if (settings.showHud) System.out.print("Enter key 1: ");
            variables.key1 = keysScanner.nextInt();
            if (settings.showHud) System.out.print("Enter key 2: ");
            variables.key2 = keysScanner.nextInt();
            if (settings.showHud) System.out.print("Enter key 3: ");
            variables.key3 = keysScanner.nextInt();
            if (settings.showHud) System.out.print("Enter key 4: ");
            variables.key4 = keysScanner.nextInt();
            if (settings.showHud) System.out.print("Enter key 5: ");
            variables.key5 = keysScanner.nextInt();
            if (settings.showHud) System.out.print("Enter key 6: ");
            variables.key6 = keysScanner.nextInt();
        } else {
            variables.key1 = 5;
            variables.key2 = 3;
            variables.key3 = 6;
            variables.key4 = 7;
            variables.key5 = 2;
            variables.key6 = 4;
        }
    }
}