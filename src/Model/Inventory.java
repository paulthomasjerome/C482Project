package Model;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    // CLASS FIELDS

    private ObservableList<Part> allParts;
    private ObservableList<Product> allProducts;

    // CONSTRUCTOR
    public Inventory() {
        this.allParts = FXCollections.observableArrayList();
        this.allProducts = FXCollections.observableArrayList();
    }

    // CLASS METHODS

    /**
     *
     * @param newPart
     */
    public void addPart(Part newPart) {
        // Add this part to list of all parts
        allParts.add(newPart);
    }


    /**
     *
     * @param partId
     * @return
     */
    public Part lookupPart(int partId) {
        // for each part in the list of all parts
        for (int index = 0; index < allParts.size(); index++) {
            // If this is the part id we are looking for
            if (allParts.get(index).getId() == partId) {
                //return this part
                return  allParts.get(index);
            }
        }
        // if we cant find part return null
        return null;
    }

    /**
     *
     * @param partName
     * @return
     */
    public ObservableList<Part> lookupPart(String partName) {
        ObservableList partsList = FXCollections.observableArrayList();
        // for each part in the list of all parts
        for (int index = 0; index < allParts.size(); index++) {
            // If the current part name has no uniquely different characters
            if (allParts.get(index).getName().contains(partName)) {
                // add this to the partsList
                partsList.add(allParts.get(index));
            }
        }
        // return the list of parts with same/similar names
        return partsList;
    }

    /**
     *
     * @param index
     * @param selectedPart
     */
    public void updatePart(int index, Part selectedPart) {
        // set the part at this index of the list of all parts to be the selected part
        allParts.set(index, selectedPart);
    }

    /**
     *
     * @param selectedPart
     * @return
     */
    public boolean deletePart(Part selectedPart) {
        // for each part in the list of all parts
        for (int index = 0; index < allParts.size(); index++) {
            // If this is the part we are looking for
            if (allParts.get(index).getId() == selectedPart.getId()) {
                // remove this part
                allParts.remove((index));
                // return true
                return true;
            }
        }
        // if we cant find part return null
        return false;
    }

    /**
     *
     * @return
     */
    public ObservableList<Part> getAllParts() {
        // return the list of all parts
        return  allParts;
    }

    /**
     *
     * @param newProduct
     */
    public void addProduct(Product newProduct) {
        // add the new product to the list of all products
        allProducts.add(newProduct);
    }

    /**
     *
     * @param productId
     * @return
     */
    public Product lookupProduct(int productId) {
        // for each product in the list of all products
        for (int index = 0; index < allProducts.size(); index++) {
            // If this is the product id we are looking for
            if (allParts.get(index).getId() == productId) {
                // return this product
                return allProducts.get(index);
            }
        }
        // if we cant find part return null
        return null;
    }

    // TODO FIND OUT WHAT THE FUCKING DEAL IS WITH THIS SHIT
    /**
     *
     * @param productName
     * @return
     */
    public ObservableList<Product> lookupProduct(String productName) {
        ObservableList productsList = FXCollections.observableArrayList();
        // for each product in the list of all products
        for (int index = 0; index < allProducts.size(); index++) {
            // If the current product name has no uniquely different characters
            if (allProducts.get(index).getName().contains(productName)) {
                // add this to the productsList
                productsList.add(allProducts.get(index));
            }
        }
        // return the list of products with same/similar names
        return productsList;
    }

    /**
     *
     * @param index
     * @param newProduct
     */
    public void updateProduct(int index, Product newProduct) {
        // set the product at this index on the list of all products to be the new product
        allProducts.set(index, newProduct);
    }

    /**
     *
     * @param selectedProduct
     * @return
     */
    public boolean deleteProduct(Product selectedProduct) {
        // for each product in the list of all parts
        for (int index = 0; index < allProducts.size(); index++) {
            // If this is the product we are looking for
            if (allProducts.get(index).getId() == selectedProduct.getId()) {
                // remove this product
                allProducts.remove((index));
                // return true
                return true;
            }
        }
        // if we cant find product return null
        return false;
    }

    /**
     *
     * @return
     */
    public ObservableList<Product> getAllProducts() {
        // return the list of all products
        return allProducts;
    }
}
