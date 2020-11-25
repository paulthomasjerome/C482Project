package model;
/**
 * Supplied class Part.java
 */

/**
 *
 * @author Paul Jerome
 */
public abstract class Part {

    // CLASS FIELDS

    protected int id;
    protected String name;
    protected double price;
    protected int stock;
    protected int min;
    protected int max;

    // CONSTRUCTERS

    public Part() {

    }

    public Part(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    // GETTERS AND SETTERS

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name of this product
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set for this product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price of this product
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set for this product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stock for this product
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set for this product
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the min of this product
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set for this product
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the max of this product
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set for this product
     */
    public void setMax(int max) {
        this.max = max;
    }

}
