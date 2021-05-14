package view;

import controller.DataBase;
import model.User;

import java.util.Scanner;

public class LoginMenuView extends MenuView {
    User user = new User(); //should be deleted

    public void CreateNewUserInput(String command) {
        command = new Scanner(System.in).nextLine();
        DataBase dataBase = new DataBase();
        if (dataBase.isCreateUserCommandValid(command)) {
            dataBase.extractUserInformation(command);
            dataBase.createNewUser();

        } else {
            if ((command.startsWith("menu enter") &&
                    command.contains("<login>"))) {
                System.out.println("please login first");
            } else {
                System.out.println("invalid command");
            }
        }
    }

    public void createNewUserSuccessMessage() {
        System.out.println("user created successfully!");
    }

    public void logIn(String command) {
        command = new Scanner(System.in).nextLine();
        if (command.startsWith("user login")) {
            DataBase dataBase = new DataBase();
            if (dataBase.isUserLoginCommandValid(command)) {
                dataBase.extractUserInformation(command);
                dataBase.usersLogInUpdate();
            }
        }
    }

    public void userInfoValidationMessage(int flag) {
        if (flag == 1) {
            System.out.println("user with username" + user.username + "already exist");
        }
        if (flag == 2) {
            System.out.println("user with password" + user.password + "already exist");
        }
        if (flag == 3) {
            System.out.println("user with nickname" + user.nickname + "already exist");
        }
    }

    public void userLoginSuccessMessage() {
        System.out.println("user logged in  successfully!");
    }
}
