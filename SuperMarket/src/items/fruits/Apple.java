package items.fruits;

import items.Produce;

public class Apple extends Produce {

    public Apple(int quantity) {
        super("Apple", quantity, 0.11);
    }

    @Override
    public void description() {
        System.out.println("the round fruit of a tree of the rose family, " +
                "which typically has thin red or green skin and crisp flesh. " +
                "Many varieties have been developed as dessert or cooking fruit " +
                "or for making cider");
    }
}
