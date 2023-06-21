package dersler;

import java.util.function.BiFunction;

public class BiFunctionexample {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultipleByNumber(2,3));
        System.out.println(incrementByOneAndMultipleByNumberWithBiFunction.apply(3,4));
    }
    static int incrementByOneAndMultipleByNumber(int number,int multipleBy){
        return (number + 2) * multipleBy;
    }
    static BiFunction<Integer,Integer,Integer>incrementByOneAndMultipleByNumberWithBiFunction=
            (number,multipleBy) -> (number + 2) * multipleBy;

}