package com.company;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();

        //  ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
        strSet.add("foo");
        strSet.add("buzz");
        strSet.add("bar");
        strSet.add("fork");
        strSet.add("bort");
        strSet.add("spoon");
        strSet.add("!");
        strSet.add("dude");

        System.out.println("Исходный set");
        System.out.println(strSet);

        strSet = removeEvenLength(strSet);

        System.out.println("set после обработки");
        System.out.println(strSet);

    }

    // public Set<String> removeEvenLength(Set<String> set);
    // метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
    public static Set<String> removeEvenLength(Set<String> set) {

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() % 2 == 0) {
                iterator.remove();
            }
        }

        return set;
    }
}
