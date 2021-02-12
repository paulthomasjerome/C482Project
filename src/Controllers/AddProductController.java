package Controllers;

import Model.Inventory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AddProductController {
    Inventory inventory;


    public AddProductController() {

    }

    public void returnToMain(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/main.fxml"));
            MainController controller = new MainController(inventory);

            loader.setController(controller);
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
