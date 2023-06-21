package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
       Task1 task1 = new Task1();
        System.out.println(task1.findDividedThree(5, 36));
    }

    public List<Integer> findDividedThree(int begin, int end) {
        List<Integer> ededler = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            ededler.add(i);
        }
        List<Integer> uceBolunen = ededler.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
        return uceBolunen;
    }
}