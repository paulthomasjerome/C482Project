package model;

import javafx.collections.ObservableList;

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

    public Product() {

    }

    public Product(ObservableList<Part> associatedParts, int id, String name, double price, int stock, int min, int max) {

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
}
