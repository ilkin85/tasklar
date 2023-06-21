package dersler;

import java.sql.SQLOutput;

public class arrrrray {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "ilkin";
        arr[1] = "memmed";
        capet(arr);

    }

    public static void capet(String[] massiv) {
        for (int i = 0; i < massiv.length; i++) System.out.print(massiv[i] + " ");
    }
}