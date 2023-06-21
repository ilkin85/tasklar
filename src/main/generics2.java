package main;
public class generics2 {
    public static void main(String[] args) {


//        generics1<String> name = new generics1<>("Dog");
//        generics1<Integer> age = new generics1<>(2);
//        generics1<Double> height = new generics1<>(1.12);
        String[] names = {"Mause","Horse","Bear","Dog"};
        Integer[] ages = {1,2,3,4,5};
        generics1.printArray(names);
        generics1.printArray(ages);
    }
}
