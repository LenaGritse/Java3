package lesson1.tasks_1_2;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass<T> {

    private T[] obj;

    public MainClass(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Тип Т: " + obj.getClass().getName());
    }

    public void printType() {
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i].toString() + " ");
        }
        System.out.println();
    }
// ЗАДАЧА №1
    public void changePlace(int i, int j) {
        if (i <= obj.length && j <= obj.length) {
            T temp = obj[i];
            obj[i] = obj[j];
            obj[j] = temp;
        }
        else {
            System.out.println("Введены некорректные значения");
        }
    }
// ЗАДАЧА №2
    public void massToList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
    }

    public static void main(String[] args) {

        MainClass<Integer> intObj = new MainClass<Integer> (new Integer[] {1, 2, 3, 4});
        intObj.printType();
        intObj.changePlace(0,3);
        intObj.printType();
        intObj.showType();

        Animal[] animals = new Animal[] {
                new Animal("Cat1"),
                new Animal("Cat2"),
                new Animal("Cat3"),
                new Animal("Cat4")
        };

        MainClass<Animal> animalObj = new MainClass<Animal>(animals);
        animalObj.printType();
        animalObj.changePlace(3,1);
        animalObj.printType();
        animalObj.massToList(animals);
        animalObj.showType();

    }
}



