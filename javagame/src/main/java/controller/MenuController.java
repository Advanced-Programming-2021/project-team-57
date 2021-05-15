package controller;

import model.User;

public class MenuController
{

    User user = new User();

    public void enterMainMenu() {
        user.setUserMenuPosition("Main Menu");
    }

    public void logout(User currentUser) {

        if ((currentUser.userMenuPosition).equals("Main Menu")) {
            currentUser.setUserMenuPosition("Login Menu");

        }

    }

    

}
