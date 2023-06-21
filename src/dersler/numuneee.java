package dersler;////public class numuneee {
////    public static void main(String[] args) {
////        String arr[] = new String[5];
////
////        int x = 5;
////        int a = 999;
////        int y = 3;
////        int b = 888;
////
////        int cem = topla(x, y);
////    }
////
////    public static int topla(int a, int b) {
////        int cem = a + b;
////        System.out.println("cem = " + cem);
////        return cem;
//    }
//}
//import java.util.Scanner;
//public class numuneee {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter a ");
//        int a = scanner.nextInt();
//        System.out.println("please enter b ");
//        int b = scanner.nextInt();
//
//        System.out.println("Please enter operation + - * / ");
//        String operation = scanner.next();
//
//        if(operation.equals("+")) {
//            int result = a+b;
//            System.out.println("Sum is "+result);
//        }
//        else if (operation.equals("-")) {
//            int result = a-b;
//            System.out.println("Sum is "+ result);
//        }
//        else if (operation.equals("*")) {
//            int result = a * b;
//            System.out.println("Sum is" + result);
//        }
//        else if( operation.equals("/")) {
//            int result = a / b;
//            System.out.println("sum is" + result);
//        }
//        else {
//            System.out.println("Wrong operation.");
//
//        }
//
//    }
//
//import java.util.Scanner;
//public class numuneee {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ededi daxil edin:");
//
//        int eded = sc.nextInt();
//        int cem = 0;
//        while (eded > 0) {
//            int qaliq = eded % 10;
//            cem = cem + qaliq;
//            eded = eded / 10;
//            ;
//        }
//        System.out.println("cem = " + cem);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a-ni daxil edin:");
//        int a = sc.nextInt(); //5
//        System.out.println("b-ni daxil edin:");
//        int b = sc.nextInt(); //8
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a="+ a + "b=" + b);
import java.util.Scanner;
public class numuneee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin: ");
        boolean b = true;
        String soz = sc.nextLine();
        for (int i = 0; i < soz.length(); i++) {
            char sol = soz.charAt(i);
            char sag = soz.charAt(soz.length() - 1 - i);
            System.out.println("*********");
            System.out.println("sol=" + sol);
            System.out.println("sag = " + sag);
            if (sol != sag) {
                b = false;
                break;
            }
        }
        System.out.println("b=" + b);
    }
}



