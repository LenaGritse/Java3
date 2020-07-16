package lesson1.task3;

public class Orange extends Fruit {
    private final float orangeWeight = 1.5f;

    public Orange() {
        super("Orange");
    }

    @Override
    public float getFruitWeight() {
        return orangeWeight;
    }
}
