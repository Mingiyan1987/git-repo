package ru.basanov.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String strings[] = {"first", "second"};
        ClassTest classTest = new ClassTest();
        classTest.swap(strings);
        for (String str: strings) {
            System.out.println(str);
        }
        List<String> list;
        list = classTest.transform(strings);
        System.out.println(list);
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            apples.add(new Apple());
        }
        Box<Apple> appleBox = new Box<>(apples);
        ArrayList<Apple> apples1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            apples1.add(new Apple());
        }
        Box<Apple> appleBox1 = new Box<>(apples1);

        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            oranges.add(new Orange());
        }
        Box<Orange> orangeBox = new Box<>(oranges);
        Iterator<Apple> iterator = appleBox.getFruits().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        appleBox.oversleeping(appleBox1);
        System.out.println("felfsefsf");
        Iterator<Apple> iterator1 = appleBox1.getFruits().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }


}
