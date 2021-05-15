


import java.util.Scanner;

public class LoginMenuView extends MenuView {
    User user = new User(); //should be deleted
    DataBase dataBase = new DataBase();

    public void CreateNewUserInput(String command) {


        if (dataBase.isCreateUserCommandValid(command)) {
            dataBase.extractUserInformation(command);
            dataBase.createNewUser();

        } else {
            command = command.toLowerCase().replaceAll("\\s", "");
            if ((command.startsWith("menu enter") &&
                    command.indexOf("main") != -1)) {
                System.out.println("please login first");
            }
        }
    }

    public void createNewUserSuccessMessage() {
        System.out.println("user created successfully!");
    }

    public void logIn(String command) {
        // command = new Scanner(System.in).nextLine();
        if (command.startsWith("user login")) {

            if (dataBase.isUserLoginCommandValid(command)) {

                dataBase.extractUserInformation(command);
                dataBase.usersLogInUpdate();
            }
        }
    }

    public void logoutInput(String command) {
        if (dataBase.isUserLogoutCommandValid(command)) {
            MenuController menuController = new MenuController();
            menuController.logout(dataBase.createUser());

        }
    }

    public void logoutSuccessMessage() {
        System.out.println("user logged out successfully!");
    }

    public void userInfoValidationMessage(int flag, String username, String nickname) {

        if (flag == 1) {
            System.out.println("user with username " + username + " already exist");
        }

        if (flag == 2) {
            System.out.println("user with nickname " + nickname + " already exist");
        }
    }


    public void userLoginFailleMessage() {
        System.out.println("username and password didn't match!");
    }

    public void userLoginSuccessMessage() {
        System.out.println("user logged in  successfully!");
    }

    public static void main(String[] args) {

        LoginMenuView loginMenuView = new LoginMenuView();
        DataBase dataBase = new DataBase();
        MainMenuView menuView = new MainMenuView();
        //String command = new Scanner(System.in).nextLine();


        //  loginMenuView.CreateNewUserInput(command);

        String command1 = new Scanner(System.in).nextLine();
        loginMenuView.logIn(command1);
        String command2 = new Scanner(System.in).nextLine();
        loginMenuView.logoutInput(command2);
        // System.out.println(dataBase.createUser());
        String command3 = new Scanner(System.in).nextLine();
        menuView.showCurrentMenuInput(command3);
    }
}
