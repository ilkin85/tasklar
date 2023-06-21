package dersler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class calisma {


    List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
    List<Integer> divisibleByThree = numbers.stream().filter(n -> n % 3 == 0).collect(Collectors.toList());
}