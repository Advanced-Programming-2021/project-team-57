package Sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {

    @FXML
    ImageView MainMenu1;
    @FXML
    ImageView MainMenu2;

    public void showMainMenu() {
        Stage mainMenuStage = new Stage();
        URL address = getClass().getResource("fxml/MainMenu.fxml");
        Parent root = null;
        try {
            root = FXMLLoader.load(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        mainMenuStage.initStyle(StageStyle.UNDECORATED);
        mainMenuStage.setScene(scene);
        mainMenuStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("image/765399.png");
        Image image = new Image(file.toURI().toString());
        MainMenu1.setImage(image);
        MainMenu2.setImage(image);

    }

    public void mainMenuBack(ActionEvent event) {
        RegisterController registerController = new RegisterController();
        registerController.back();
    }

    public void deleteUser(ActionEvent event) {
Popup popup = new Popup();
       popup.showDeleteMessage();

    }

public void profile(ActionEvent event){
        Profile profile = new Profile();
        profile.showProfile();
}



}