package Sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    ImageView registerImage;
    @FXML
    Label registerMessage;
    @FXML
    TextField registerUsername;
    @FXML
    TextField registerPassword;
    @FXML
    TextField registerNickname;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("image/2.png");
        Image image = new Image(file.toURI().toString());
        registerImage.setImage(image);

    }

    public void registerButton(ActionEvent event) {

        if (registerUsername.getText().isEmpty() || registerPassword.getText().isEmpty()) {
            registerMessage.setText("please enter your information!");
        } else {
            User user = createNewUser();
            LoginController loginController = new LoginController();
            if (loginController.registerIsValid(user)) {

                registerMessage.setText("user created successfully!");
                loginController.addUser(user);

            } else {
                registerMessage.setText("username is already exist!");
            }

        }
    }


    public User createNewUser() {
        User user = new User();
        user.setUsername(registerUsername.getText());
        user.setPassword(registerPassword.getText());
        user.setNickName(registerNickname.getText());
        return user;
    }

    public void registerCancelButton(ActionEvent event) {
        back();
    }

    public void back() {
        Stage primaryStage = new Stage();
        URL address = getClass().getResource("fxml/View.fxml");
        Parent root = null;
        try {
            root = FXMLLoader.load(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
