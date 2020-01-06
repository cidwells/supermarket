package items.dairy;

import items.Produce;

public class Eggs extends Produce {

    public Eggs(int quantity) {
        super("Eggs", quantity, 1.00);
    }
    @Override
    public void description() {
        System.out.println("Protein from a chicken be careful of the yolk");

    }
}
