package items.vegetables;

import items.Produce;

public class Spinach extends Produce {

    public Spinach(int quantity) {
        super("Spinach", quantity, 0.13);
    }

    @Override
    public void description() {
        System.out.println("a widely cultivated edible Asian plant of the goosefoot " +
                "family, with large, dark green leaves that are eaten raw or cooked " +
                "as a vegetable.");
    }
}
