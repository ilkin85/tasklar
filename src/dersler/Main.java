package dersler;//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a-nı daxil edin:");
        double a=sc.nextDouble();

        System.out.println("b-ni daxil edin:");
        double b=sc.nextDouble();

        System.out.println("emeliyyati daxil edin:");
        int emeliyyat=sc.nextInt();
        System.out.println("a="+a+",b="+b+",emeliyyat"+emeliyyat);
        double netice=0;

        if (emeliyyat==1){
             netice=a+b;

        }

        if (emeliyyat==2) {
            netice = a - b;

        }
        if (emeliyyat==3) {
            netice = a *b;

        }
        if (emeliyyat==4) {
            netice = a / b;

        }
        System.out.println("netice" + netice);

//        int x=5;
//        int y=10;
//
//        int z=x+y;
//        System.out.println(z);
//
//        int c=x-y;
//        System.out.println(c);
//
//        int v=x*y;
//        System.out.println(v);
//
//        double a=18;
//        double b=5;
//        double bolme=a/b;
//        System.out.println(bolme);
//
//        char s='s';
//        System.out.println(s);
//
//        String soz="Salam";
//        System.out.println(soz);



    }
}