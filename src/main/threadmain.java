//package main;
//
//public class threadmain extends Thread{
//    @Override
//    public void run(){
//        System.out.println(Thread.currentThread().getName()+"is runing");
//
//    }
//}


// runnnable
package main;

public class threadmain implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is runing");
    }

}