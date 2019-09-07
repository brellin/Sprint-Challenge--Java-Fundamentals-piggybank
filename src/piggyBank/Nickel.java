package piggyBank;

public class Nickel extends Money {

    public Nickel(int quantity) {
        super(.05, quantity);
    }

    public Nickel() {
        super(.05, 1);
    }

    @Override
    public void printTotal() {
        System.out.println(this.getQuantity() + (this.getQuantity() > 1 ? " Nickels" : " Nickel"));
    }

}
