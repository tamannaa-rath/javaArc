import java.util.Scanner;

public class madLibs {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the following: ");
        System.out.print("A verb(ing form): ");
        String verb = scanner.nextLine();
        System.out.print("An adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("A place: ");
        String place = scanner.nextLine();
        System.out.print("A name: ");
        String name = scanner.nextLine();

        System.out.println("Here's your story: ");

        System.out.print("The elephant was "+verb+ " when the cops came.");
        System.out.print("The cops looked "+adjective+" standing in the middle of the "+place);
        System.out.println(".They named the elephant '"+name+"'.");

        scanner.close();
    }
    
}
