package model;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 */
public class Product {

    // CLASS FIELDS

    ObservableList<Part> associatedParts;
    protected int id;
    protected String name;
    protected double price;
    protected int stock;
    protected int min;
    protected int max;

    // CONSTRUCTERS

    /**
     *
     */
    public Product() {

    }

    /**
     *
     * @param associatedParts
     * @param id
     * @param name
     * @param price
     * @param stock
     * @param min
     * @param max
     */
    public Product(ObservableList<Part> associatedParts, int id, String name, double price, int stock, int min, int max) {
        this.associatedParts = associatedParts;
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    // GETTERS AND SETTERS

    /**
     *
     * @return
     */
    public ObservableList<Part> getAssociatedParts() {
        return associatedParts;
    }

    /**
     *
     * @return
     */
    public void setAssociatedParts(ObservableList<Part> associatedParts) {
        this.associatedParts = associatedParts;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @return
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     *
     * @return
     */
    public int getMin() {
        return min;
    }

    /**
     *
     * @return
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     *
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     *
     * @return
     */
    public void setMax(int max) {
        this.max = max;
    }

    // INSTANCE METHODS

    /**
     *
     * @param part
     */
    public void addAssociatedPart(Part part) {
        // add a part to this products associatedParts
        associatedParts.add(part);
    }

    /**
     *
     * @param selectAssociatedPart
     * @return
     */
    public boolean deleteAssociatedPart(Part selectAssociatedPart) {
        // for each part in the list of associated parts
        for (int index = 0; index < associatedParts.size(); index++) {
            // if this is the part we are looking for
            if(selectAssociatedPart.getId() == associatedParts.get(index).getId()) {
                // remove this part from the list of associated parts
                associatedParts.remove(selectAssociatedPart);
                // return true
                return true;
            }
        }
        // return false if no part is removed
        return false;
    }

    /**
     *
     * @return
     */
    public ObservableList<Part> getAllAssociatedParts() {
        return associatedParts;
    }
}
