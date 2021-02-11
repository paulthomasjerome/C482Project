package Model;

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

    // TODO FIND OUT WHAT THE FUCKING DEAL IS WITH THIS SHIT
    /**
     *
     * @param partName
     * @return
     */
    public Part lookupPart(String partName) {
        // for each part in the list of all parts
        for (int index = 0; index < allParts.size(); index++) {
            // If this is the part name we are looking for
            if (allParts.get(index).getName().equals(partName)) {
                //return this part as a list
                return allParts.get(index);
            }
        }
        // if we cant find part return null
        return null;
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
    public Product lookupProduct(String productName) {
        // for each part in the list of all parts
        for (int index = 0; index < allProducts.size(); index++) {
            // If this is the part name we are looking for
            if (allProducts.get(index).getName().equals(productName)) {
                //return this part as a list
                return allProducts.get(index);
            }
        }
        // if we cant find part return null
        return null;
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
        // for each part in the list of all parts
        for (int index = 0; index < allProducts.size(); index++) {
            // If this is the part we are looking for
            if (allProducts.get(index).getId() == selectedProduct.getId()) {
                // remove this part
                allProducts.remove((index));
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
    public ObservableList<Product> getAllProducts() {
        // return the list of all products
        return allProducts;
    }
}
