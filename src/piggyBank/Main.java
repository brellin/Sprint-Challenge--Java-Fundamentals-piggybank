package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    static DecimalFormat fp = new DecimalFormat("$###,###.00");

    private static double sum(ArrayList<Money> list) {

        double sum = 0;
        for (Money it : list) {
            sum += it.getTotal();
            it.printTotal();
        }
        return sum;

    }

    private static double diff(ArrayList<Money> total, double amount) {

        double sum = 0;
        for (Money it : total) {
            sum += it.getTotal();
        }

        if (sum >= amount) {

            sum -= amount;
            System.out.println("Removed " + fp.format(amount));
            return sum;

        } else {

            System.out.println("Tried to remove " + fp.format(amount) + ", but the piggy bank doesn't have "
                    + fp.format(amount) + "!\nIt is lacking " + fp.format(amount - sum) + ".");
            return sum;

        }
    }

    private static void printTotal(double total) {

        System.out.println("\n================================\n");
        System.out.println(" The piggy bank contains: " + fp.format(total));
        System.out.println("\n================================\n");

    }

    public static void main(String[] args) {

        ArrayList<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        double total = sum(piggyBank);

        printTotal(total);

        double sub = diff(piggyBank, 2.54);

        printTotal(sub);

        diff(piggyBank, 10);

    }

}
