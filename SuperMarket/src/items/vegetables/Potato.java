package items.vegetables;

import items.Produce;

public class Potato extends Produce {

    public Potato(int quantity) {
        super("Potato", quantity, 0.15);
    }

    @Override
    public void description() {
        System.out.println("a starchy plant tuber which is one of the most important " +
                "food crops, cooked and eaten as a vegetable");
    }
}
