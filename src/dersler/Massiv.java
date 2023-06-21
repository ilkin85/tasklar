package dersler;

import java.util.Scanner;

//public class Massiv {
//    public static void main(String[] args) {
//
//        boolean b= detectSymmetry("Hello");
//        System.out.println("b="+b);
//
//
//    }
//    public static boolean detectSymmetry(String s1){
//
//        for ( int i = 0; i < s1.length();i++){
//            char sol = s1.charAt(i);
//            char sag = s1.charAt(s1.length()-1-i);
//            System.out.println("---------");
//            System.out.println("sol="+sol);
//            System.out.println("sag="+sag);
//            if(sol != sag) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
public class Massiv {
    public static void main(String[] args) {
        int[][] arr = new int[2][5];

        //daxil edilme hissesi
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println((i+1)+"-ci Ededi daxil edin:");
                arr[i][j] = sc.nextInt();
            }

        }

        //capa verilme hisssi
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }
    }
}