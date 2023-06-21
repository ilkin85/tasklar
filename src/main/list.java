package main;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList yemekler = new ArrayList();
        yemekler.add("Salat");
        yemekler.add("dolma");
        yemekler.add("kabab");
        yemekler.add("Salat");
        yemekler.add(2,"canavar");
        yemekler.forEach(yemek-> System.out.println(yemek));
    }
}
