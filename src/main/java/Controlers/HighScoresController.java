package Controlers;

import Services.HighestRecordsManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HighScoresController extends Controller implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Label highScores;
    private HighestRecordsManager recordsManager = HighestRecordsManager.INSTANCE;

    @FXML
    public void onButtonClick(ActionEvent event){
        try {
            if (event.getSource().equals(backButton)){
                showMenu();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void showMenu() throws IOException {
        prepareScene(backButton, "Menu.fxml");
    }

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        highScores.setText(recordsManager.prepareContentForLabel());
    }
}
