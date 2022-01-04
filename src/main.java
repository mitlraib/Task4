import java.util.Scanner;
public class main {



    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
         User [] users = new User[ARRAY_SIZE];

        final int CREATE_NEW_ACCOUNT = 1;
        final int LOG_IN = 2;
        final int EXIT = 3;
        Scanner scanner = new Scanner(System.in);
        RealEstate RealEstate = new RealEstate();

do {



        System.out.println("hello and welcome to our new bulletin board of real estate!");
            System.out.println("We hope you find what you are looking for.... ");
            System.out.println("Here is a computerized menu, please select one of the following options:");
            System.out.println("1 - create new account ");
            System.out.println("2 - log in ");
            System.out.println("3 - exit ");
            int cases = scanner.nextInt();

        switch (cases) {
            case CREATE_NEW_ACCOUNT:
                System.out.println("you chose to creat a new account");
                RealEstate.createUser();
                String password = new Scanner(System.in).nextLine();
                for (int i = 0; i < password.length(); i++) {
                    char currentChar = password.charAt(i);
                    if (Character.isAlphabetic(currentChar)) {

                    }
                    if (Character.isAlphabetic(currentChar)) {
                    }
                }

            case LOG_IN:
                System.out.println("you chose to log in");
                RealEstate.userLogin();
                if (RealEstate.userLogin() == null) {
                    System.out.println("Sorry, the details you inserted doesn't exist");
                    System.out.println("You can create a new account... ");

                } else {
                    System.out.println("Great, you are logged in");
                    System.out.println("What would you want to do? ");
                    System.out.println("1 - Post a new property ");
                    System.out.println("2 - Remove my post ");
                    System.out.println("3 - See all posts in this real estate board ");
                    System.out.println("4 - see all of my posts ");
                    System.out.println("5 - search for properties by parameters ");
                    System.out.println("6 - log off and return to main menu ");

                    int innerCases = scanner.nextInt();


                    switch (innerCases) {
                        case 1:
                            System.out.println("You chose to advertise a new property");
                            RealEstate.postNewProperty(users[0]);
                            break;

                        case 2:
                            System.out.println("You chose to remove your post");
                            RealEstate.removeProperty(users[0]);
                            break;

                        case 3:
                            System.out.println("You chose to present all properties");
                            RealEstate.printAllProperties();
                            break;

                        case 4:
                            System.out.println("You chose to present all properties you uploaded");
                            RealEstate.printUserProperties(users[0]);
                            break;

                        case 5:
                            System.out.println("You chose to search property by parameters");
                            RealEstate.search();

                            break;


                        case 6:
                            System.out.println("return to main menu");
                            break;
                    }
                }
        }

        if (cases ==3){
            break;
        }

    }while (true);

     }

    }
