package items.vegetables;

import items.Produce;

public class Carrot extends Produce {

    public Carrot(int quantity) {
        super("Carrot", quantity, 0.18);
    }

    @Override
    public void description() {
        System.out.println("a tapering orange-colored root eaten as a vegetable");
    }
}
