package model;

import javafx.collections.ObservableList;

public class Inventory {

    // CLASS FIELDS

    private static ObservableList<Part> allParts;
    private static ObservableList<Product> allProducts;

    // CLASS METHODS

    /**
     *
     * @param newPart
     */
    public static void addPart(Part newPart) {

    }


    /**
     *
     * @param partId
     * @return
     */
    public static Part lookupPart(int partId) {

    }

    /**
     *
     * @param partName
     * @return
     */
    public static ObservableList<Part> lookupPart(String partName) {

    }

    /**
     *
     * @param index
     * @param selectedPart
     */
    public static void updatePart(int index, Part selectedPart) {

    }

    /**
     *
     * @param selectedPart
     * @return
     */
    public static boolean deletePart(Part selectedPart) {

    }

    /**
     *
     * @return
     */
    public static ObservableList<Part> getAllParts() {

    }

    /**
     *
     * @param newProduct
     */
    public static void addProduct(Product newProduct) {

    }

    /**
     *
     * @param productId
     * @return
     */
    public static Product lookupProduct(int productId) {

    }

    /**
     *
     * @param productName
     * @return
     */
    public static ObservableList<Product> lookupProduct(String productName) {

    }

    /**
     *
     * @param index
     * @param newProduct
     */
    public static void updateProduct(int index, Product newProduct) {

    }

    /**
     *
     * @param selectedProduct
     * @return
     */
    public static boolean deleteProduct(Product selectedProduct) {

    }

    /**
     *
     * @return
     */
    public static ObservableList<Product> getAllProducts() {

    }
}
