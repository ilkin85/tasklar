package main;

import java.util.HashSet;
import java.util.function.Consumer;

public class set {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("Huseyn");
        set.add(123);
        set.add(true);
        set.add("Huseyn");

        set.forEach((element) -> System.out.println(element));
    }
}
