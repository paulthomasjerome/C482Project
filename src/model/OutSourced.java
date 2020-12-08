package Model;

public class OutSourced extends Part {

    // CLASS FIELDS

    private String companyName;

    // CONSTRUCTERS
    public OutSourced() {

    }

    public OutSourced(int partID, String name, double price, int stock, int min, int max, String companyName) {
        setId(partID);
        setName(name);
        setPrice(price);
        setStock(stock);
        setMin(min);
        setMax(max);
        this.companyName = companyName;
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
