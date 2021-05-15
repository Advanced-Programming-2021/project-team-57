

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;


public class DataBase {
    // User currentUser = new User(); //should be deleted
    // LoginMenuView loginMenuView = new LoginMenuView();
    HashMap<String, String> userlogin = new HashMap<>();
    String username;
    String password;
    String nickname;
    static ArrayList<User> allUsers = new ArrayList<User>();
    Gson gson = new Gson();

    public void writeDataToFile(Object user) {
        try {
            FileWriter userWrite = new FileWriter("user.json");
            userWrite.write(gson.toJson(allUsers));
            userWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readDataFromFile() {
        try (Reader reader = new FileReader("user.json")) {
            Type listType = new TypeToken<ArrayList<User>>() {
            }.getType();
            allUsers = (gson.fromJson(reader, listType));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void usersLogInUpdate() {
        createUser();

        readDataFromFile();
        if (userLoginInfoValidation() == 1) {

            LoginMenuView loginMenuView = new LoginMenuView();


            loginMenuView.userLoginSuccessMessage();
        } else {
            LoginMenuView loginMenuView = new LoginMenuView();
            loginMenuView.userLoginFailleMessage();
        }

    }

    public void extractUserInformation(String command) {
        command = command.replaceAll("\\s", "");
        HashMap<String, String> userlogin = new HashMap<>();
        String[] b = (command.split("--"));


        for (int i = 1; i < b.length; i++) {
            String input = b[i].replaceAll(".*\\<|\\>.*", "");
            if (input != null) {
                userlogin.put(b[i].substring(0, b[i].indexOf("<")), input);
            }


        }
        username = userlogin.get("username");
        password = userlogin.get("password");
        nickname = userlogin.get("nickname");


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


    public boolean isCreateUserCommandValid(String command) {
        command = command.toLowerCase().replaceAll("\\s", "");
        return command.startsWith("usercreate") &&
                ((command.indexOf("username") != -1) || (command.indexOf("u") != -1)) &&
                (((command.indexOf("password") != -1)) || (command.indexOf("p") != -1)) &&
                (((command.indexOf("nickname") != -1)) || (command.indexOf("n") != 1));

    }

    public boolean isUserLoginCommandValid(String command) {
        command = command.toLowerCase().replaceAll("\\s", "");
        if (command.startsWith("userlogin") &&
                (command.indexOf("username") != -1) &&
                (command.indexOf("password") != -1)
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
        readDataFromFile();
        if (userInfoValidation() == 0) {

            allUsers.add(user);
            writeDataToFile(user);
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
            if ((username).equals(allUsers.get(i).username)) {
                if ((password).equals(allUsers.get(i).password)) {
                    flag = 1;
                }
            }
        }
        return flag;

    }

    public User createUser() {
        LoginMenuView loginMenuView = new LoginMenuView();
        User currentUser = new User();
        currentUser.setUsername(usernameUpdate());
        currentUser.setNickname(nicknameUpdate());
        currentUser.setPassword(passwordUpdate());
        currentUser.setUserMenuPosition("Main Menu");
        return currentUser;

    }

}