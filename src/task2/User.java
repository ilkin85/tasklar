package task2;

public class User {
    //user clasinda deyisenler
    private String login;
    private String password;
    private String name;
    private String lastname;
    private int age;
    private Money money;

    public User(String login, String password, String name, String lastname, int age, double amount) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        money = new Money(amount);
    }

    // getter ve setterler
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Money getMoney() {
        return money;
    }

    // pulu cixarmaq ucun metod
    public double withdrawMoney(double amount) {
        System.out.println("Withdrawing " + amount + "$");
        money.setAmount(money.getAmount() - amount);
        return money.getAmount();
    }

    // balansda olan pulu double kimi qaytarmaq metodu
    public double showMoneyAmount() {
        return money.getAmount();
    }

    // balansa pul elave ucun metod
    public double addMoney(double amount){
        System.out.println("Adding " + amount + "$");
        money.setAmount(money.getAmount() + amount);
        return money.getAmount();
    }

    //toString metoduna asagidaki yazdiqlarim menimsetmekk
    @Override
    public String toString(){
        return login + ": " + name + " " + lastname + ", " + age + " years old - " + money;
    }
}
