package piggyBank;

public class Quarter extends Money {

    public Quarter(int quantity) {
        super(.25, quantity);
    }

    public Quarter() {
        super(.25, 1);
    }

    @Override
    public void printTotal() {
        System.out.println(this.getQuantity() + (this.getQuantity() > 1 ? " Quarters" : " Quarter"));
    }

}
