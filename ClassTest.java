package ru.basanov.javacore;

import java.util.ArrayList;
import java.util.List;

public class ClassTest<S extends String & List> {
    ArrayList<S> listArray = new ArrayList<>();

    public S[] swap(S[] sArray) {
        S nextArr = sArray[1];
        sArray[1] = sArray[0];
        sArray[0] = nextArr;
        return sArray;
    }

    public ArrayList<S> transform(S[] sArray) {
        for (int i = 0; i <sArray.length; i++) {
            listArray.add(sArray[i]);
        }
        return listArray;
    }
}
