package piggyBank;

public class Penny extends Money {

    public Penny(int quantity) {
        super(.01, quantity);
    }

    public Penny() {
        super(.01, 1);
    }

    @Override
    public void printTotal() {
        System.out.println(this.getQuantity() + (this.getQuantity() > 1 ? " Pennies" : " Penny"));
    }

}
