//package main;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//public class hashmap {
//    public static void main (String []args){
//
//        HashMap hashMap = new HashMap();
//
//        hashMap.put("60","Tovuz");
//        hashMap.put("57","Şəmkir");
//        hashMap.put("99","Baki");
//        Set set = hashMap.entrySet();
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            Map.Entry element = (Map.Entry) iterator.next();
//            System.out.println(element.getKey() + " "+element.getValue());
//        }
//    }

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hashmap {
    public static void main(String[] args) {
        List <String>list =new ArrayList<>();
        list.add  ("Huseyn");
        list.add ( "Soltan");
        list.add ("Osman");
        list.add ("Taleh");
        String index2 = list.get(2);
        System.out.println("result is "+index2);

        Iterator <String> iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}