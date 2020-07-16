package lesson1.task3;

public class Apple extends Fruit {
    private final float appleWeight = 1.0f;

    public Apple() {
        super("Apple");
    }

    @Override
    public float getFruitWeight() {
        return appleWeight;
    }
}
