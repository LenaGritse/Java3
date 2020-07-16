package lesson1.task3;

public abstract class Fruit {
    private String fruitType;
    private float fruitWeight;

    public Fruit(String fruitType) {
        this.fruitType = fruitType;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public abstract float getFruitWeight();
}
