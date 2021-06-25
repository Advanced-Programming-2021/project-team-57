package main;

public class MenuView {
    public void showCurrentMenuInput(String command){
        MenuController menuController =new MenuController();
        if(menuController.isShowCurrentMenuCommandValid(command)){
            DataBase dataBase = new DataBase();
            showCurrentMenuOutput(dataBase.createUser());
        }
    }
    public void showCurrentMenuOutput(User currentUser){
        System.out.println(currentUser.userMenuPosition);
    }
}
