package piggyBank;

interface displayAmount {

    public void printTotal();

}

public abstract class Money implements displayAmount {

    private double value;
    private int quantity;

    public Money(double value, int quantity) {

        this.value = value;
        this.quantity = quantity;

    }

    // getters
    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return this.getValue() * this.getQuantity();
    }

    // setter
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
