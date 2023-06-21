package dersler;

public class User {
    private String name;
    private String surname;
    private int age;
    public static int objectCount = 0;

    public User() {
        this.name = " name is undefined.";
        this.surname = " surname is undefined.";
        this.age = -1;
        System.out.println("User");
        ObyektYaradildigiZamanMeniMutleqCAgir();
        objectCount++;
    }

    public User(String name, String surname, int age) {
        System.out.println("User parametri yaradildi.");
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void ObyektYaradildigiZamanMeniMutleqCAgir() {
        System.out.println("Men burada cox vacib is gorurem.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}