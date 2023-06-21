package dersler;

public class Obyektler {

    public static void main(String[] args) {
        User u = new User("Anar","Babayev",25);
        System.out.println(u.getName());
    }
//        User u = new User();
//        u.setName("Azay");
//        System.out.println(u.getName());
//        System.out.println(u.getSurname());
//        System.out.println(u.getAge());

//        new User();
//        new User();
//        new User();
//        new User();
//        new User();
//        new User();
//        new User();
//        new User();
//        new User();
//        System.out.println(User.objectCount);

        public static void foo(){
        foo2();
        System.out.println("foo");
        }
        public static void foo2(){
        foo3();
        System.out.println("foo2");

        }
        public static void foo3(){
            System.out.println("foo3");
        }

}
