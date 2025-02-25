import java.util.Scanner;
public class MenuDrivenProgram{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu ();
            System.out.print("Enter your choice (1-3): ");
            int choice = input.nextInt();

            running = handleMenuChoice( choice, input);
        }

        input.close();

    }

   public static void displayMenu(){
        System.out.println("Menu: ");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    public static boolean handleMenuChoice ( int choice, Scanner input){
        switch (choice){
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(input);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            
        }
        return true;
    }

    public static void greetUser(){
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd(Scanner input){
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number  + " is an Even number.");
        } else {
            System.out.println(number  + " is an Odd number.");
        }
    }  
}

