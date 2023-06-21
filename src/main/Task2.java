package main;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Messi");
        hashSet.add("Neymar");
        hashSet.add("Messi");
        hashSet.add("Suarez");
        System.out.println("HashSet" + hashSet);


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Messi");
        arrayList.add("Neymar");
        arrayList.add("Messi");
        arrayList.add("Suarez");

        System.out.println("Arraylist" + arrayList);

    }
}
