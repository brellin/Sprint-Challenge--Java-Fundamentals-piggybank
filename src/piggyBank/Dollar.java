package piggyBank;

public class Dollar extends Money {

    public Dollar(int quantity) {
        super(1, quantity);
    }

    public Dollar() {
        super(1, 1);
    }

    @Override
    public void printTotal() {
        System.out.println(this.getQuantity() + (this.getQuantity() > 1 ? " Dollars" : " Dollar"));
    }

}
