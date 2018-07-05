package ru.basanov.javacore;

import java.util.ArrayList;
import java.util.ListIterator;

public class Box<F extends Fruit> {
    private ArrayList<F> fruits;
    private float weightBox;

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public float getWeightBox() {
        weightBox = fruits.size();
        return weightBox;
    }

    public void setFruits(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<F> getFruits() {
        return fruits;
    }

    public boolean compare(float weightBox) {
        if (this.weightBox == weightBox) {
            return true;
        } else {
            return false;
        }
    }

    public void oversleeping(Box<F> box) {
        if (this.fruits.contains(box.getFruits().get(0))) {
            ArrayList<F> result = new ArrayList<>(this.fruits.size() + box.getFruits().size());
            result.addAll(this.fruits);
            result.addAll(box.getFruits());
            box.setFruits(result);
            this.fruits.removeAll(this.fruits);
        } else {

        }
    }
}
