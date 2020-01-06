package items.fruits;

import items.Produce;

public class Orange extends Produce {

    public Orange(int quantity) {
        super("Orange", quantity, 0.09);
    }

    @Override
    public void description() {
        System.out.println("a round juicy citrus fruit with a " +
                "tough bright reddish-yellow rind");
    }
}
