//package main;
//
//public class thread {
//    public static void main(String[] args) {
//        for(int i=0; i < 15; i++){
//
//           threadmain mythread = new threadmain();
//           mythread.start();
//        }
//    }
//}


//runnable
package  main;
 public class thread {
    public static void main(String[] args) {
        for(int i = 0;i < 15; i++){
            Thread thread = new Thread(new threadmain());
            thread.start();
        }
    }
}