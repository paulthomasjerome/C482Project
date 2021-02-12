package Controllers;

import Model.Inventory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    Inventory inventory;

    public MainController(Inventory inventory) {

    }


    public void addPart(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/addPart.fxml"));
            AddPartController controller = new AddPartController();

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

    public void addProduct(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/addProduct.fxml"));
            AddProductController controller = new AddProductController();

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

    public void modifyPart(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/modifyPart.fxml"));
            ModifyPartController controller = new ModifyPartController();

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

    public void modifyProduct(MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/modifyProduct.fxml"));
            ModifyProductController controller = new ModifyProductController();

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
