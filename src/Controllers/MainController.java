package Controllers;

import Model.Inventory;
import Model.Part;
import Model.Product;
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
    private ObservableList<Part> partInventory = FXCollections.observableArrayList();
    private ObservableList<Product> productInventory = FXCollections.observableArrayList();

    Inventory inventory;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generatePartsTable();
        generateProductsTable();
    }

    private <T> TableColumn<T, Double> formatPrice() {
        TableColumn<T, Double> costCol = new TableColumn("Price");
        costCol.setCellValueFactory(new PropertyValueFactory<>("Price"));
        // Format as currency
        costCol.setCellFactory((TableColumn<T, Double> column) -> {
            return new TableCell<T, Double>() {
                @Override
                protected void updateItem(Double item, boolean empty) {
                    if (!empty) {
                        setText("$" + String.format("%10.2f", item));
                    }
                    else{
                        setText("");
                    }
                }
            };
        });
        return costCol;
    }

    private void generatePartsTable() {
        partInventory.setAll(inventory.getAllParts());
        partsTable.setItems(partInventory);
        partsTable.refresh();
    }

    private void generateProductsTable() {
        productInventory.setAll(inventory.getAllProducts());
        productsTable.setItems(productInventory);
        productsTable.refresh();
    }

    // CONSTRUCTORS

    public MainController() {

    }

    public MainController(Inventory inventory) {
        this.inventory = inventory;
    }


    public void addPart(MouseEvent event) {

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

    public void addProduct(MouseEvent event) {

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

    public void modifyPart(MouseEvent event) {

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

    public void modifyProduct(MouseEvent event) {

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
