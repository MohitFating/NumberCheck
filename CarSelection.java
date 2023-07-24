import java.util.Scanner;

public class CarSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a car model:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. Convertible");
        System.out.println("4. Hatchback");
        System.out.println("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        String carType;

        switch (choice) {
            case 1:
                carType = "Sedan";
                break;
            case 2:
                carType = "SUV";
                break;
            case 3:
                carType = "Convertible";
                break;
            case 4:
                carType = "Hatchback";
                break;
            default:
                carType = "Unknown";
                break;
        }

        if (carType.equals("Unknown")) {
            System.out.println("Invalid choice!");
        } else {
            System.out.println("You selected a " + carType + ".");
        }

        scanner.close();
    }
}
