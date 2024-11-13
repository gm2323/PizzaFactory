import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField nameField;

    @FXML
    private Label greetingLabel;

    @FXML
    private void handleSubmit() {
        String name = nameField.getText();
        greetingLabel.setText("Hello, " + name + "!");
    }
}
