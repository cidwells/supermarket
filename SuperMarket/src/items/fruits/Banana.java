package items.fruits;

import items.Produce;

public class Banana extends Produce {

    public Banana(int quantity) {
        super("Banana", quantity, 0.12);
    }

    @Override
    public void description() {
        System.out.println("a long curved fruit which grows in clusters and has soft " +
                "pulpy flesh and yellow skin when ripe");
    }
}
