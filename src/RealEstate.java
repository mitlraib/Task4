import java.util.Scanner;

public  class RealEstate {
    final int ARRAY_SIZE = 100;
    public  static  final int MIN_CHARS_IN_PASSWORD = 6;

    private User [] users = new User[ARRAY_SIZE];
   private Property [] properties= new Property [ARRAY_SIZE];
  private   Address [] addresses= new  Address[ARRAY_SIZE];
int location =0;

    public RealEstate () {
        this.users = new User[0];
    }

    Scanner scanner = new Scanner(System.in);

    public void createUser(){
        String username = null;
        do{
            System.out.println("Enter username: ");
            username = scanner.nextLine();

        }while (isUsernameExist(username));
        String password = null;

        do {
            System.out.println("Enter password: ");
            password = scanner.nextLine();

        } while (!isStrongPassword(password));

        if (isStrongPassword(password)){
            System.out.println("Great! that is your password, please try to remember it :) ");
        }

// start phoneNumber

        boolean invalid = false;
        String phoneNumber= " ";
        do {
            System.out.println("Please enter your phoneNumber : ");
             phoneNumber= scanner.nextLine();
            if (phoneNumber.length()!=10){
                System.out.println("Invalid! phone numbers has exactly 10 digits...");
                System.out.println("Try again..");
                invalid = true;
            }


            else {
                invalid = false;
                for (int i = 0; i < phoneNumber.length(); i++) {
                    if (!(Character.isDigit(phoneNumber.charAt(i)))) {
                        System.out.println("Invalid! phone numbers are from numbers only....");
                        System.out.println("Try again..");
                        invalid = true;
                        break;
                    }
                }
            }

            if (!(phoneNumber.charAt(0) == '0')|| !(phoneNumber.charAt(1) == '5')){
                System.out.println("Invalid! phone numbers starts with 05 ");
                System.out.println("Try again..");
                invalid = true;
            }


        }while (invalid);

        if (!invalid){
            System.out.println("Great!");
            System.out.println(" ");
        }
        // end phoneNumber


        System.out.println(" ");
        System.out.println("Are you a regular user? (true/false) ");
       boolean isRegular= scanner.nextBoolean();
       if (isRegular) {
           System.out.println("Great, good luck finding your new home :)");
       }
       else {
           System.out.println("Good luck finding a good sale! ");
       }

        addUserToArray(username,password,phoneNumber,isRegular);

       User user = new User(username,password,phoneNumber,isRegular);


    }



    private void  addUserToArray (String username, String password, String phoneNumber, boolean isRegular){
        User [] newArray = new User[this.users.length +1];
        for (int i = 0; i < this.users.length; i++) {
            newArray[i] =this.users[i];
        }
        User userToAdd = new User(username,password,phoneNumber,isRegular );
        newArray [this.users.length] = userToAdd;
        this.users = newArray;
    }

    public User userLogin(){
        User user;
        System.out.println(" please insert your username:");
        String username = scanner.nextLine();
        System.out.println(" please insert your password:");
        String password = scanner.nextLine();
        if (isPasswordExist(password) &&  isUsernameExist(username)){

           location = userLocation (username);
            user = users [location];
            return user;
        }

        return null;
    }



    private boolean isStrongPassword (String passwordToCheck) {
        boolean strong = false;
        boolean validLength = false;
        boolean hasLetter =false;
        boolean hasDigit = false;
        if (passwordToCheck.length() >= MIN_CHARS_IN_PASSWORD){
            validLength = true;
        }
        for (int i = 0; i < passwordToCheck.length(); i++) {
            char currentChar = passwordToCheck.charAt(i);
            if ( Character.isDigit(currentChar)){
                hasDigit = true;
            }
            else if (Character.isAlphabetic(currentChar)) {
                hasLetter = true;
            }

            if (hasDigit && hasLetter){
                break;
            }

        }

        if (validLength && hasLetter && hasDigit){
            strong = true;
        }

        return  strong;
    }

    private  int userLocation (String username){
        boolean usernameExists = false;
        for (int i = 0; i < this.users.length  ; i++) {
            User currentUser = this.users [i];
            if (currentUser.getUsername().equals(username)){
                usernameExists = true;
                return i;
            }
        }
        return 0;
    }

    private  boolean isPasswordExist (String passwordToCheck){
        boolean passwordExists = false;
        for (int i = 0; i < this.users.length  ; i++) {
            User currentUser = this.users [i];
            if (currentUser.getPassword().equals(passwordToCheck)){
                passwordExists = true;
                break;
            }
        }
        return passwordExists;
    }

    private  boolean isUsernameExist (String usernameToCheck){
        boolean exists = false;
        for (int i = 0; i < this.users.length  ; i++) {
            User currentUser = this.users [i];
            if (currentUser.getUsername().equals(usernameToCheck)){
                exists = true;
                break;
            }
        }
        return exists;
    }

   public boolean postNewProperty(User user){
        User isReg = null;
        boolean fullPosted = true;
        Address.cities();


       if ( isReg.getIsRegular()){
           System.out.println("You can post only 3 properties");
           if (!fullPosted){
               System.out.println("great");
           }
       }
       else{
           System.out.println("You can post only 10 properties");
       }

      //  need to be fixed
       System.out.println("please chose a city");
      String [] array = Address.cities();
       String userCity = scanner.nextLine();
       for (int i = 0; i < array.length; i++) {
           if (userCity.equals(array[i])) {
               System.out.println(" harray!!!");
           }


           }
        if ((userCity.equals(array[0]))||(userCity.equals(array[1]))||(userCity.equals(array[2]))||
               (userCity.equals(array[3]))|| (userCity.equals(array[4]))||(userCity.equals(array[5]))||(userCity.equals(array[6]))
               || (userCity.equals(array[7]))||(userCity.equals(array[8]))||(userCity.equals(array[9]))||(userCity.equals(array[10])))
       {
           System.out.println("Invalid");
       }

        return true;
   }


     public void removeProperty(User user){

    }

    public void printAllProperties(){

    }
   public void printUserProperties(User user){

    }

    public Property[] search(){

        return properties;
    }




    public RealEstate(User[] users, Property[] properties, Address[] addresses, int location, Scanner scanner) {
        this.users = users;
        this.properties = properties;
        this.addresses = new Address[10];
        this.location = location;
        this.scanner = scanner;

    }
}

