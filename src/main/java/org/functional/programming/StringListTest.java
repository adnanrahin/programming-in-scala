package org.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class StringListTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("TEST");

        list.add("TEST");

        System.out.println(list.get(0) == list.get(1));

        System.out.println(list.get(0).hashCode());

        System.out.println(list.get(1).hashCode());

        System.out.println(list);

    }

}
