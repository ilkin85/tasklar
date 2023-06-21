package dersler;

import java.util.function.Function;

public class Functionexample {
    public static void main(String[] args) {
        System.out.println(incrementByOne(4));
        System.out.println(incrementByOnewithFunction.apply(8));
    }
    static int incrementByOne(int number){
        return number + 1;
    }
    static Function<Integer,String> incrementByOnewithFunction =
//            number ->++number;
                number ->"Number is" + number;
}
