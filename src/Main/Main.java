package Main;

import Model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//TODO finish class documentation
/** This class runs an application that*/
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Inventory inventory = new Inventory();
        addTestData(inventory);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/main.fxml"));
        Controllers.MainController controller = new Controllers.MainController(inventory);
        loader.setController(controller);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    void addTestData(Inventory inventory) {
        //Add InHouse Parts
        Part a1 = new InHouse(1, "Part A1", 2.99, 10, 5, 100, 101);
        Part a2 = new InHouse(3, "Part A2", 4.99, 11, 5, 100, 103);
        Part b = new InHouse(2, "Part B", 3.99, 9, 5, 100, 102);
        inventory.addPart(a1);
        inventory.addPart(b);
        inventory.addPart(a2);
        inventory.addPart(new InHouse(4, "Part A3", 5.99, 15, 5, 100, 104));
        inventory.addPart(new InHouse(5, "Part A4", 6.99, 5, 5, 100, 105));
        //Add OutSourced Parts
        Part o1 = new OutSourced(6, "Part O1", 2.99, 10, 5, 100, "ACME Co.");
        Part p = new OutSourced(7, "Part P", 3.99, 9, 5, 100, "ACME Co.");
        Part q = new OutSourced(8, "Part Q", 2.99, 10, 5, 100, "FLORIDA Co.");
        inventory.addPart(o1);
        inventory.addPart(p);
        inventory.addPart(q);
        inventory.addPart(new OutSourced(9, "Part R", 2.99, 10, 5, 100, "FLORIDA Co."));
        inventory.addPart(new OutSourced(10, "Part O2", 2.99, 10, 5, 100, "NY Co."));
        //Add allProducts
        Product prod1 = new Product(100, "Product 1", 9.99, 20, 5, 100);
        prod1.addAssociatedPart(a1);
        prod1.addAssociatedPart(o1);
        inventory.addProduct(prod1);
        Product prod2 = new Product(200, "Product 2", 9.99, 29, 5, 100);
        prod2.addAssociatedPart(a2);
        prod2.addAssociatedPart(p);
        inventory.addProduct(prod2);
        Product prod3 = new Product(300, "Product 3", 9.99, 30, 5, 100);
        prod3.addAssociatedPart(b);
        prod3.addAssociatedPart(q);
        inventory.addProduct(prod3);
        Product prod4 = new Product(400, "Product 4", 29.99, 20, 5, 100);
        inventory.addProduct(prod4);
        inventory.addProduct(new Product(500, "Product 5", 29.99, 9, 5, 100));

    }

    /** This is the main method. This is the first method called by the shell to start a java program */
    public static void main(String[] args) {
        launch(args);
    }
}
