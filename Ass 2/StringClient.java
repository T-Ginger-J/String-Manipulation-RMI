import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class StringClient {
    public static void main(String[] args) {
        try {
            // Connect to the RMI registry and lookup the StringManipulation service
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            StringManipulation stub = (StringManipulation) registry.lookup("StringManipulation");

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                // Display the menu to the user
                System.out.println("\nString Manipulation Options:");
                System.out.println("1. Reverse String");
                System.out.println("2. Reverse Word Order");
                System.out.println("3. Convert to Upper Case");
                System.out.println("4. Convert to Lower Case");
                System.out.println("5. Convert to Camel Case");
                System.out.println("6. Convert to Snake Case");
                System.out.println("7. Exit");
                System.out.print("Select an option (1-7): ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over

                if (choice == 7) {
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                }

                // Prompt user for the input string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                String result = "";
                switch (choice) {
                    case 1:
                        result = stub.gnirtSesrever(input);
                        break;
                    case 2:
                        result = stub.OrderWordreverse(input);
                        break;
                    case 3:
                        result = stub.TOUPPERCASE(input);
                        break;
                    case 4:
                        result = stub.tolowercase(input);
                        break;
                    case 5:
                        result = stub.toCamelCase(input);
                        break;
                    case 6:
                        result = stub.to_snake_case(input);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        continue;
                }

                // Display the result of the chosen operation
                System.out.println("Result: " + result);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
