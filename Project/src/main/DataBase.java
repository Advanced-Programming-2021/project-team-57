package main;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class DataBase {
    // User currentUser = new User(); //should be deleted
    // LoginMenuView loginMenuView = new LoginMenuView();
    HashMap<String, String> userlogin = new HashMap<>();
    int a ;
    String username;
    String password;
    String nickname;
    static ArrayList<User> allUsers = new ArrayList<User>();
    Gson gson = new Gson();

    public void writeDataToFile(Object user) {
        String json = gson.toJson(allUsers);
        try {
            FileWriter fw = new FileWriter("user.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readDataFromFile() {
        try {
            Reader reader = new FileReader("user.json");
            Type listType = new TypeToken<ArrayList<User>>() {
            }.getType();
            allUsers = (gson.fromJson(reader, listType));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean usersLogInUpdate() {
        if (userLoginInfoValidation() == 1) {
            createUser();
            return true ;
        } else {
            LoginMenuView loginMenuView = new LoginMenuView();
            loginMenuView.userLoginFailleMessage();
            return  false ;
        }

    }

    public void extractUserInformation(String command) {
        //command = command.replaceAll("\\s", "");
        // HashMap<String, String> userlogin = new HashMap<>();
        String[] b = (command.split(" "));
     /*   for (int i = 1; i < b.length; i++) {
            String input = b[i].replaceAll(".*\\<|\\>.*", "");
            if (input != null) {
                userlogin.put(b[i].substring(0, b[i].indexOf("<")), input);
            }
            else {
                System.out.println("invalid command");
            }
        }*/
        for (int i = 0; i < b.length; i++) {
            if (b[i].contains("username")) {
                username = b[i + 1];
            }
            if (b[i].contains("nickname")) {
                nickname = b[i + 1];
            }
            if (b[i].contains("password")) {
                password = b[i + 1];
            }
        }

    }

    public String usernameUpdate() {
        return username;


    }


    public String passwordUpdate() {
        return password;


    }

    public String nicknameUpdate() {
        return nickname;

    }

    public void userScoresUpdate() {

    }


    public static boolean isCreateUserCommandValid(String command) {
        return command.startsWith("user create") &&
                ((command.contains("username"))) &&
                ((command.contains("password"))) &&
                ((command.contains("nickname")));

    }

    public boolean isUserLoginCommandValid(String command) {
        // command = command.toLowerCase().replaceAll("\\s", "");
        if (command.startsWith("user login") &&
                (command.contains("username")) &&
                (command.contains("password"))
        ) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isUserLogoutCommandValid(String command) {
        command = command.toLowerCase().replaceAll("\\s", "");
        if (command.startsWith("userlogout")) {
            return true;
        } else {
            return false;
        }
    }

    public User createNewUser() {
        LoginMenuView loginMenuView = new LoginMenuView();

        User user = new User();
        user.setUsername(usernameUpdate());
        user.setNickname(nicknameUpdate());
        user.setPassword(passwordUpdate());
        user.setUserMenuPosition("Login Menu");
        //readDataFromFile();
        if (userInfoValidation() == 0) {

            allUsers.add(user);
            // writeDataToFile(user);
            loginMenuView.createNewUserSuccessMessage();
        } else {
            loginMenuView.userInfoValidationMessage(userInfoValidation(), username, nickname);
        }
        return user;
    }

    public int userInfoValidation() {
        int flag = 0;

        for (int i = 0; i < allUsers.size(); i++) {

            if ((username).equals(allUsers.get(i).username)) {
                flag = 1;

            }

            if ((nickname).equals(allUsers.get(i).nickname)) {
                flag = 2;

            }
        }
        return flag;
    }

    public int userLoginInfoValidation() {
        int flag = 0;
        for (int i = 0; i < allUsers.size(); i++) {
            if (username.equals(allUsers.get(i).username)) {
                if (password.equals(allUsers.get(i).password)) {
                    flag = 1;
                }
            }
        }
        return flag;

    }

    public User createUser() {
        User user = new User();
        user.setUsername(usernameUpdate());
        user.setNickname(nicknameUpdate());
        user.setPassword(passwordUpdate());
        user.setUserMenuPosition("Main Menu");
        LoginMenuView loginMenuView = new LoginMenuView();
        loginMenuView.userLoginSuccessMessage();
        System.out.println("enter a command to enter a specific menu");
        user.userMenuPosition = "Main Menu";
        String mainmenucommand = new Scanner(System.in).nextLine();
        mainmenucommand = mainmenucommand.toLowerCase();
        if (mainmenucommand.startsWith("menu enter")) {
            MainMenuView Mview = new MainMenuView();
            String[] st = mainmenucommand.split(" ");
            if (st[2].contains("duel")) Mview.Duel();
            if (st[2].contains("deckmenu")) Mview.Deckmenu();
            if (st[2].contains("scoreboard")) Mview.ScoreBoard();
            if (st[2].contains("profile")) Mview.Profile(user);
            if (st[2].contains("shop")) Mview.Shop();
            if (st[2].contains("import/export")) Mview.Import();
        } else if (mainmenucommand.startsWith("menu show-current")) {
            System.out.println(user.userMenuPosition);
            createUser();
        } else if (mainmenucommand.startsWith("user logout")) {
            MenuController.logout(user);
            System.out.println("user logged out successfully!");
        } else {
            System.out.println("invalid command");
        }
return user;
    }
    public User createAUser(User currentUser) {
        LoginMenuView loginMenuView = new LoginMenuView();
        currentUser = new User();
        currentUser.setUsername(usernameUpdate());
        currentUser.setNickname(nicknameUpdate());
        currentUser.setPassword(passwordUpdate());
        currentUser.setUserMenuPosition("Main Menu");
        return currentUser;

    }

}