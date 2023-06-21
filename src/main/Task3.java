package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ilkin", "elesgerli");
        map1.put("memmed", "haqverdi");
        map1.put("Zamir", "sefeorv");
        List<String> adlar = new ArrayList<>(map1.keySet());
        List<String> soyadlar = new ArrayList<>(map1.values());
        System.out.println("acarlar =" + adlar);
        System.out.println("deyerler =" + soyadlar);
    }
}