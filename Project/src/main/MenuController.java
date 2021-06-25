package main;

import java.util.Scanner;

public class MenuController {
    User user = new User();

    public void enterMainMenu() {
        user.setUserMenuPosition("Main Menu");
    }

    public static void logout(User currentUser) {

        if ((currentUser.userMenuPosition).equals("Main Menu")) {
            currentUser.setUserMenuPosition("Login Menu");
            System.out.println(currentUser.userMenuPosition);
            LoginMenuView loginMenuView = new LoginMenuView();
            loginMenuView.logoutSuccessMessage();
            String command = new Scanner(System.in).nextLine();
            loginMenuView.logIn(command);
        }

    }
  public boolean isShowCurrentMenuCommandValid(String command){
        command = command.toLowerCase().replaceAll("\\s", "");
        if(command.startsWith("menu show-current")){
            return true;
        }else {
            return false;
        }
    }

}
