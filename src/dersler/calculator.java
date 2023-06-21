package dersler;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println("Emeliyyati secin:"
                +"\n1.Toplama"
                +"\n2.Cixma"
                +"\n3.Vurma"
                +"\n4.Bolme");
        Scanner sc = new Scanner (System.in);
        int menu = sc.nextInt();

         sc = new Scanner (System.in);

        System.out.println("a-ni daxil edin:");
        int a= sc.nextInt();

        System.out.println("b-ni daxil edin:" );
         int b = sc.nextInt();

        if(menu==1){
            topla(a,b);
        } else if (menu == 2) {
            cix(a, b);

        }
        else if(menu == 3){
            vur(a , b);
        }
        else if (menu == 4){
            bol(a, b);
        }

    }


    public static void topla(int a, int b){
        int cem =a+b;
        System.out.println("cem="+cem);

    }
    public static void cix(int a, int b){
        int ferq= a-b;
        System.out.println("ferq="+ferq);

    }
    public static void vur(int a, int b){
        int hasil = a * b;
        System.out.println("hasil="+hasil);

    }
    public static void bol(int a, int b){
       int qismet= a / b;
       System.out.println("qismet="+qismet);
    }
}

