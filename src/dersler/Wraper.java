package dersler;

public class Wraper {

    public static void main(String[] args) {

        compareStrs(new String("Salam"),new String("Salam"));
    }
    public static void compareStrs(String s1 , String s2){
        System.out.println(s1.equals(s2));

    }
}
