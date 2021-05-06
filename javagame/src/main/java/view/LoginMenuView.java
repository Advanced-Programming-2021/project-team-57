package view;

import controller.DataBase;
import model.User;

import java.util.Scanner;

class LoginMenuView extends MenuView {

    public void CreatNewUserInput(String command) {
        command = new Scanner(System.in).nextLine();
        DataBase dataBase = new DataBase();
        if (dataBase.isCreateUserCommandValid(command)) {
            dataBase.createUser();
        } else {
            if ((command.startsWith("menu enter") &&
                    command.contains("<login>"))) {
                System.out.println("please login firs");
            } else {
                System.out.println("invalid command");
            }
        }
    }

    public void creatNewUser(String username, String password) {

    }

    public void logIn(String username, String password) {

    }
}
