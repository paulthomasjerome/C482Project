package Controllers;

import Model.Inventory;
import Model.Part;
import Model.Product;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TableView<Part> partsTable;
    @FXML
    private TableView<Product> productsTable;
    private ObservableList<Part> partsList = FXCollections.observableArrayList();
    private ObservableList<Product> productsList = FXCollections.observableArrayList();

    Inventory inventory;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        renderPartsData();
        renderProductsData();
    }

    private void renderPartsData() {
        partsList.setAll(inventory.getAllParts());
        partsTable.setItems(partsList);
        partsTable.refresh();
    }

    private void renderProductsData() {
        productsList.setAll(inventory.getAllProducts());
        productsTable.setItems(productsList);
        productsTable.refresh();
    }

    public MainController() {

    }

    public MainController(Inventory inventory) {
        this.inventory = inventory;
    }

    public void terminate(MouseEvent event) {
        Platform.exit();
    }

    public void addPartScene(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/addPart.fxml"));
            AddPartController controller = new AddPartController(inventory);
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

    public void addProductScene(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/addProduct.fxml"));
            AddProductController controller = new AddProductController(inventory);
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

    public void modifyPartScene(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/modifyPart.fxml"));
            ModifyPartController controller = new ModifyPartController(inventory);
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

    public void modifyProductScene(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/modifyProduct.fxml"));
            ModifyProductController controller = new ModifyProductController(inventory);
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
