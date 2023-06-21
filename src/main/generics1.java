package main;

public class generics1 <T>{
//    T data;
//    public generics1(T data){
//        this.data = data;
//        System.out.println(data);
    public static <E> void printArray(E[] names){
        for (E name:names){
            System.out.println(name);
        }
}

}
