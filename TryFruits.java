package lesson1.task3;

public class TryFruits {
    public static void main(String[] args){
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        appleBox.addFruitInBox(apple1);
        appleBox.addFruitInBox(apple2);
        appleBox.addFruitInBox(apple3);
        appleBox.boxInfo();
        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());

        orangeBox.addFruitInBox(orange1);
        orangeBox.addFruitInBox(orange2);
        orangeBox.boxInfo();
        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<Apple>();
        appleBox.emptyBox().boxInfo();
        appleBox.boxInfo();

    }
}
