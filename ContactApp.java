import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        String[] options = {"Add Contact","Remove Contact","Find Contact by Phone Number","Find Contact by First Name", "Find Contact by Last Name", 
        "Edit Contact"};

        System.out.println("Welcome To Afeez Contact ");
        System.out.println("=========================================");

        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {

            int count = 1;

            for (int index = 0; index < options.length; index++) {
                System.out.printf("%d. %s%n", count, options[index]);
                count++;
            }

            System.out.print("\nSelect an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

            case 1:

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = input.nextLine();

        Contact contact = new Contact(firstName, lastName, phoneNumber);

        contacts.add(contact);

        System.out.println("Contact added successfully.");

        break;

       
             case 2:

        System.out.print("Enter Phone Number to Remove: ");
        String phone = input.nextLine();

        boolean found = false;

        for (int index = 0; index < contacts.size(); index++) {

        if (contacts.get(index).getPhoneNumber().equals(phone)) {

            contacts.remove(index);

            System.out.println("Contact removed successfully.");

            found = true;

            break;
           }
       }

        if (!found) {
           System.out.println("Contact not found.");
        }

             break;

             case 3:

        System.out.print("Enter Phone Number: ");
        String phoneNumberSearch = input.nextLine();

            boolean phoneNumberFound = false;

        for (int index = 0; index < contacts.size(); index++) {

        if (contacts.get(index).getPhoneNumber().equals(phoneNumberSearch)) {

            System.out.println("First Name: " + contacts.get(index).getFirstName());
            System.out.println("Last Name: " + contacts.get(index).getLastName());
            System.out.println("Phone Number: " + contacts.get(index).getPhoneNumber());

            phoneNumberFound = true;

            break;
           }
        }

        if (!phoneNumberFound) {
            System.out.println("Contact not found.");
         }

          break;


             case 4:

        System.out.print("Enter First Name: ");
        String firstNameSearch = input.nextLine();

           boolean firstNameFound = false;

        for (int index = 0; index < contacts.size(); index++) {

        if (contacts.get(index).getFirstName().equalsIgnoreCase(firstNameSearch)) {

            System.out.println("First Name: " + contacts.get(index).getFirstName());
            System.out.println("Last Name: " + contacts.get(index).getLastName());
            System.out.println("Phone Number: " + contacts.get(index).getPhoneNumber());

            firstNameFound = true;

            break;
             }
          }

        if (!firstNameFound) {
            System.out.println("Contact not found.");
             }

            break;

             case 5:

        System.out.print("Enter Last Name: ");
        String lastNameSearch = input.nextLine();

         boolean lastNameFound = false;

        for (int index = 0; index < contacts.size(); index++) {

        if (contacts.get(index).getLastName().equalsIgnoreCase(lastNameSearch)) {

            System.out.println("First Name: " + contacts.get(index).getFirstName());
            System.out.println("Last Name: " + contacts.get(index).getLastName());
            System.out.println("Phone Number: " + contacts.get(index).getPhoneNumber());

            lastNameFound = true;

            break;
              }
            }

      if (!lastNameFound) {
          System.out.println("Contact not found.");
          }

           break;

             case 6:

        System.out.print("Enter Phone Number of the Contact to Edit: ");
        String phoneNumberEdit = input.nextLine();

        boolean phoneNumberEditFound = false;

        for (int index = 0; index < contacts.size(); index++) {

        if (contacts.get(index).getPhoneNumber().equals(phoneNumberEdit)) {

            System.out.print("Enter New First Name: ");
            contacts.get(index).setFirstName(input.nextLine());

            System.out.print("Enter New Last Name: ");
            contacts.get(index).setLastName(input.nextLine());

            System.out.print("Enter New Phone Number: ");
            contacts.get(index).setPhoneNumber(input.nextLine());

            System.out.println("Contact updated successfully.");

            phoneNumberEditFound = true;

              break;
             }
          }

        if (!phoneNumberEditFound) {
        System.out.println("Contact not found.");
       }

        break;

                

            }

            System.out.print("\nDo you want to perform another operation? (yes/no): ");
            answer = input.nextLine();
        }

       
    }
}