import java.io.Console;

/*
 * James T. Dohner
 * Java Final Project: Inventory Management System
 * June 22, 2023
 * 
 */

public class App {
    
    static Console Read = System.console();

    //Admininistrater Login Credentials
    static String adminName = "Admin";
    static String adminPassword = "Password1234";

    public static void main(String[] args) throws Exception {

        //Fill Inventory

        //User Navigation
        UserSelectHome();
        

    }

    //Leval 1 Home menue
    public static void UserSelectHome() {
        boolean flagHome = true;

        while (flagHome) {
            System.out.println("\nPlease select an option: ");
            System.out.println("1.) Admin login \n2.) View inventory\n3.) Exit");
            
            try {
                int choice = Integer.parseInt(Read.readLine());
                switch (choice) {
                //Go to Admin login 
                case 1:
                    flagHome = AdminLogin();
                    break;
                //Go to open inventory user
                case 2:
                    //flagHome = ViewInventory();
                    break;
                //Exit the program
                case 3:
                    return;                                                                   
                default:
                    System.out.println("\n\n!!!!Please enter a valid selection!!!\n\n");
                    break;
                }
            } 
            
            catch (Exception e) {
                System.out.println("\n\n!!!!Please enter a valid selection!!!\n\n");

            }

                    
        }
        
    }


    public static boolean AdminLogin() 
    {
        boolean flagCheck = true;
        boolean backComand = true;

        while(flagCheck){
            System.out.println("Please enter your username. ");
            String nameIn = Read.readLine();

            if (adminName.equals(nameIn)) {
                flagCheck = false;

                System.out.println("Good User Name");
            } 
            else {
                System.out.println("Invalid username.\n\n");
            }
        }

        flagCheck = true;

        while (flagCheck) {
            System.out.println("Please enter your password.");
            char[] stringIn = Read.readPassword();
            String passwordIn = new String(stringIn);

            if (adminPassword.equals(passwordIn)) {
               flagCheck = false;

               System.out.println("Good Password");
                //backComand = AdminMenu();
            } 
            else {
                System.out.println("Invalid password.\n\n");
            }
        }

        return backComand;
    }
}//End of App
