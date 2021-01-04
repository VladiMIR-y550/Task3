import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please input name: ");
        System.out.print(validationInput() + " Hello World");
    }

    static String validationInput() {
        Scanner scan = new Scanner(System.in);
        String input = null;
        boolean valid = false;

        while(!valid) {
            if (scan.hasNext("[a-zA-Z]*")) {
                input = scan.nextLine();
                valid = true;
            } else {
                System.out.print("Invalid input, please input name: ");
                scan.nextLine();
            }
        }
        return input;
    }
}