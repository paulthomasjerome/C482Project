package model;

public class Outsourced extends Part {

    // CLASS FIELDS

    private String companyName;

    // CONSTRUCTERS
    public Outsourced() {

    }

    public Outsourced(int partID, String name, double price, int stock, int min, int max, String companyName) {

    }

    // GETTERS AND SETTERS

    /**
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
