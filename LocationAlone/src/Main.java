import java.util.Scanner;  // Import the Scanner to enable user input.

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter location");

        String Location = myObj.nextLine();  // Read user input
        System.out.println("Location is: " + Location);  // Output user input
    }
}
