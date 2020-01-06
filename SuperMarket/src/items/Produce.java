package items;

public abstract class Produce {

    private String name;
    private int quantity;
    private double pricePerItem;
    private double totalPrice;

    public Produce(String name, int quantity, double pricePerItem) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.totalPrice = quantity * pricePerItem;
    }

    public abstract void description();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double price) {
        this.pricePerItem = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
