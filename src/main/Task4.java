package main;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Fenerbahce");
        list.add("Qarabag");
        list.add("Barcelona");
        methodfor(list);
        methodForEach(list);
        methodLambda(list);
    }

    public static void methodfor(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void methodForEach(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }

    }

    public static void methodLambda(List<String> list) {
        list.forEach(System.out::println);
    }
}