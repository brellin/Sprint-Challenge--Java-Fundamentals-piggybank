package piggyBank;

public class Dime extends Money {

    public Dime(int quantity) {
        super(.1, quantity);
    }

    public Dime() {
        super(.1, 1);
    }

    @Override
    public void printTotal() {
        System.out.println(this.getQuantity() + (this.getQuantity() > 1 ? " Dimes" : " Dime"));
    }

}
