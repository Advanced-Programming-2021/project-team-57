public class MenuController {
    User user = new User();

    public void enterMainMenu() {
        user.setUserMenuPosition("Main Menu");
    }

    public void logout(User currentUser) {

        if ((currentUser.userMenuPosition).equals("Main Menu")) {
            currentUser.setUserMenuPosition("Login Menu");
            System.out.println(currentUser.userMenuPosition);
            LoginMenuView loginMenuView = new LoginMenuView();
            loginMenuView.logoutSuccessMessage();
        }

    }
    public boolean isShowCurrentMenuCommandValid(String command){
        command = command.toLowerCase().replaceAll("\\s", "");
        if(command.startsWith("showcurrentmenu")){
            return true;
        }else {
            return false;
        }
    }

}
