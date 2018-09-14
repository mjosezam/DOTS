
package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private AnchorPane InicialPanel;
    @FXML
    private AnchorPane RegistroPanel;
    @FXML
    private AnchorPane EsperaPanel;
    @FXML
    private AnchorPane ContricantePanel;
    @FXML
    private JFXTextField IpField;
    @FXML
    private JFXTextField NombreField;
    private boolean willConsume = false;

    public Controller() {
    }

    public void onExitButtonClicked(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }

    public void onOkButtonClicked(MouseEvent event) {
        this.RegistroPanel.setVisible(true);
        this.InicialPanel.setVisible(false);
        this.EsperaPanel.setVisible(false);
        this.ContricantePanel.setVisible(false);
    }

    public void onReadyButtonClicked(MouseEvent event) {
        this.RegistroPanel.setVisible(false);
        this.InicialPanel.setVisible(false);
        this.EsperaPanel.setVisible(false);
        this.ContricantePanel.setVisible(true);
    }

    public void onPlayButtonClicked(MouseEvent event) {
        this.RegistroPanel.setVisible(true);
        this.InicialPanel.setVisible(false);
        this.EsperaPanel.setVisible(false);
        this.ContricantePanel.setVisible(false);
    }

    @FXML
    public void OnGame() throws IOException {
       Main.setScene("Game.fxml");
    }
    public void handle(KeyEvent event) {
        Object temp0 = event.getSource();
        if (this.willConsume) {
            event.consume();
        }

        String temp = event.getCode().toString();
        if (!event.getCode().toString().matches("[a-zA-Z]") && event.getCode() != KeyCode.BACK_SPACE && event.getCode() != KeyCode.SHIFT) {
            if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                this.willConsume = true;
            } else if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                this.willConsume = false;
            }
        }

    }
}