package view;

import controller.DataBase;
import controller.MenuController;
import model.User;

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
    public void logoutInput(String command){
        if(dataBase.isUserLogoutCommandValid(command)){
            MenuController menuController= new MenuController();
            menuController.logout(dataBase.createUser());
        }
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
}
