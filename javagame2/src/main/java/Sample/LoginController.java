package Sample;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.stage.StageStyle;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    Gson gson = new Gson();
    static ArrayList<User> loggedInUser = new ArrayList<>();
    static ArrayList<User> allUsers = new ArrayList<User>();

    @FXML
    private Label loginMessage;
    @FXML
    private ImageView imageView;
    @FXML
    private TextField usernameText;
    @FXML
    private TextField passwordText;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("image/1.jpg");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);

    }

    public void loginButton(ActionEvent event) {

        loginMessage.setText("trying to login!");
        if (usernameText.getText().isEmpty() || passwordText.getText().isEmpty()) {
            loginMessage.setText("please enter your information!");

        } else {
            User user = createUser();

            if (loginIsValid(user)) {

                loginMessage.setText("logged in successfully!");
                loggedInUser.clear();
                loggedInUser.add(user);
            } else {
                loginMessage.setText("your information is not valid!");
            }
        }
    }

    public void registerButton(ActionEvent event) {
        showRegisterMenu();
    }

    public void cancelButton(ActionEvent event) {
        System.exit(0);
    }

    public void mainMenuButton(ActionEvent event) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
    }

    public boolean loginIsValid(User user) {
        boolean flag = false;

        readDataFromFile();
        for (int i = 0; i < allUsers.size(); i++) {
            if (user.getUsername().equals(allUsers.get(i).getUsername())) {
                if (user.getPassword().equals(allUsers.get(i).getPassword())) {
                    flag = true;


                }
            }
        }
        return flag;
    }

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


    public User createUser() {
        User user = new User();
        user.setUsername(usernameText.getText());
        user.setPassword(passwordText.getText());

        return user;
    }

    public void showRegisterMenu() {
        Stage stage = new Stage();
        URL address = getClass().getResource("fxml/Register.fxml");
        Parent root = null;
        try {
            root = FXMLLoader.load(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();

    }

    public boolean registerIsValid(User user) {
        boolean flag = true;


        readDataFromFile();
        for (int i = 0; i < allUsers.size(); i++) {
            if (user.getUsername().equals(allUsers.get(i).getUsername()) ||
                user.getNickName().equals(allUsers.get(i).getNickName())) {
                flag = false;
            }
        }
        return flag;
    }

    public void addUser(User user) {

        allUsers.add(user);
        writeDataToFile(user);

    }

    public int userIndex() {
        int index = 0;
        readDataFromFile();
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUsername().equals(loggedInUser.get(0).getUsername())) {
                index = i;

            }
        }
        return index;
    }

    public void deleteUserFromFile() {

        int index = userIndex();


        allUsers.remove(index);
        writeDataToFile(null);
    }

    public void changeUserPassword(String password) {
        int index = userIndex();
        String username = allUsers.get(index).getUsername();
        String nickname = allUsers.get(index).getNickName();
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);
        user.setNickName(nickname);
        allUsers.remove(index);
        allUsers.add(user);
        writeDataToFile(user);


    }
    public boolean isNewNicknameValid(String nickname){
        boolean flag = true;
        for (int i = 0; i < allUsers.size(); i++) {
            if(nickname.equals(allUsers.get(i).getNickName())){
                flag = false;
            }
        }
        return flag;
    }
    public void changeUserNickname(String nickname){
        int index = userIndex();
        String username = allUsers.get(index).getUsername();
        String password = allUsers.get(index).getPassword();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setNickName(nickname);
        allUsers.remove(index);
        allUsers.add(user);
        writeDataToFile(user);

    }

}


