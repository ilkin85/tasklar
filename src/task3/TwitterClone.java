package task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwitterClone {
    List<User> users = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void registerNewUser() {
        System.out.println("Enter your firstname: ");
        String firstname = sc.nextLine();
        System.out.println("Enter your lastname: ");
        String lastname = sc.nextLine();
        System.out.println("Enter your login: ");
        String login = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        System.out.println("Enter your tweet text: ");
        String text = sc.nextLine();

        users.add(new User(firstname, lastname, login, password, text));
        System.out.println("User " + login + " successfully registered!");
    }

    public boolean loginToUser() {
        System.out.println("Enter your login: ");
        String login = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        //yoxlama
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void deleteUser() {
        System.out.println("Enter your login: ");
        String login = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        for(User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                System.out.println("User " + user.getLogin() + " deleted.");
                users.remove(user);
            }
        }
    }

    public void printUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i+1) + ". " + users.get(i).getLogin() + " - " + users.get(i).getFirstname());
        }
    }
}
