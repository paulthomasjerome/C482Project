package Model;

public class InHouse extends Part {

    private int machineID;

    public InHouse() {

    }

    public InHouse(int partID, String name, double price, int stock, int min, int max, int machineID) {
        setId(partID);
        setName(name);
        setPrice(price);
        setStock(stock);
        setMin(min);
        setMax(max);
        this.machineID = machineID;
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
