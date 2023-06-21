package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TwitterClone twitter = new TwitterClone();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Delete user");
            System.out.println("4.View all users");
            System.out.println("5.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                twitter.registerNewUser();
            }
            else if (choice == 2){
                boolean isLogged = twitter.loginToUser();
                while (isLogged) {
                    System.out.println("1.View tweets");
                    System.out.println("2.Log out");

                    int choice2 = sc.nextInt();
                    sc.nextLine();

                    if(choice2 == 1) {
                        for(int i = 0; i < twitter.users.size(); i++) {
                            System.out.println((i+1)+". "+twitter.users.get(i).getLogin() +" - "+twitter.users.get(i).showTweet());
                        }
                    }

                    if(choice2 == 2) {
                        break;
                    }

                }
            }
            else if (choice == 3) {
                twitter.deleteUser();
            }
            else if (choice == 4) {
                twitter.printUsers();
            }
            else if (choice == 5) {
                return;
            }
        }

    }
}
