package Sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Popup {
    public void showDeleteMessage() {
        Stage mainMenuStage = new Stage();
        URL address = getClass().getResource("fxml/Popup.fxml");
        Parent root = null;
        try {
            root = FXMLLoader.load(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);

        mainMenuStage.setScene(scene);
        mainMenuStage.show();
    }
    public void deleteValidation(ActionEvent event) {
        LoginController loginController = new LoginController();
        loginController.deleteUserFromFile();
    }
}
