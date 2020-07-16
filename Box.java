package lesson1.task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private float boxWeight;

    public Box() {
        this.box = new ArrayList<T>();
    }

    public ArrayList addFruitInBox(T fruit) {
        this.box.add(fruit);
        return box;
    }

    public float  getWeight() {
        for (Fruit t : box) {
            boxWeight+=t.getFruitWeight();
        }
        return boxWeight;
    }

    public boolean compare(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public Box<T> emptyBox() {
        Box<T> newBox = new Box<>();
        for (T t : this.box) {
            System.out.println(t.getClass().getName() + " пересыпано в новую коробку");
            newBox.addFruitInBox(t);
        }
        this.box.removeAll(box);
        return newBox;
    }

    public void boxInfo() {
        if (box.isEmpty()) {
            System.out.println("Коробка пуста.");
        }
        else {
            System.out.println("Содержимое коробки:");
            for (T t : box) {
                System.out.println(t.getClass().getName());
            }
        }
    }
}
