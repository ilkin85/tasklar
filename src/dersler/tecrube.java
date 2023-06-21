package dersler;/*
public class tecrube {
    public static void main(String[] args) {
       int [] arr = {1, 2, 1};
       boolean net = checkArray  (arr);
        System.out.println("net="+net);

    }

    public static boolean checkArray(int [] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
*/




public class tecrube {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        boolean net = checkArrayIncrement(arr);
        System.out.println("net="+net);
    }

    public static boolean checkArrayIncrement(int [] arr){
        boolean res = true;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                res = false;
            }
        }
        return res;
    }
}
