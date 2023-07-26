import java.util.Scanner;

public class SupercarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a supercar model:");
        String supercarModel = scanner.nextLine();

        switch (supercarModel) {
            case "Ferrari":
                System.out.println("Ferrari is an Italian supercar brand.");
                break;
            case "Lamborghini":
                System.out.println("Lamborghini is a famous Italian luxury sports car.");
                break;
            case "Bugatti":
                System.out.println("Bugatti is known for producing high-performance hypercars.");
                break;
            case "Porsche":
                System.out.println("Porsche is a German luxury car manufacturer.");
                break;
            case "McLaren":
                System.out.println("McLaren produces high-performance sports cars.");
                break;
            default:
                System.out.println("Supercar model not recognized or not in our list.");
                break;
        }

        scanner.close();
    }
}
