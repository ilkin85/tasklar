//Elə bir proqram yaz ki, başladanda səndən qeydiyyatdan keçmək, və daxil olmaq istədiyini soruşsun misal üçün (
//        1. register
//        2. login
//        3. exit
//        ) sonra 1 2 və ya 3 daxil edirsən.
//        Əgər 1 daxil edildisə bizdən ad və parol istəsin (
//        type your neü name: -- yazdın enter basdin o birisi çıxır
//        type your  neü passüord:
//        )
//        Əgər 2 daxil edildisə(
//        type your name: -- yazdın enter basdin o birisi çıxır
//        type your passüord:
//        ) əgər ad və parol məlumatlar saxlanılan databasedə varsa yəni if else ilə yoxlayırsan çap etsin ki giriş edildi, əgər yoxdursa və ya səhvdisə yazsın ki səhv
//        Əgər 3 daxil edilsə sönsün return 0 çap da edə bilərsən nə isə
package task1;

import java.util.Scanner;
import java.util.HashMap;

public class LogInTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> users = new HashMap<String, String>();

        while (true) {
            // secimleri cap edir
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            // secimi qeyde alir
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Type your new name: ");
                String name = scanner.nextLine();
                System.out.print("Type your new password: ");
                String password = scanner.nextLine();
                users.put(name, password);
            } else if (choice == 2) {
                System.out.print("Type your name: ");
                String name = scanner.nextLine();
                System.out.print("Type your password: ");
                String password = scanner.nextLine();
                // yoxlama aparilir
                if (users.containsKey(name) && users.get(name).equals(password)) {
                    System.out.println("Logged in successfully.");
                } else {
                    System.out.println("Incorrect name or password.");
                }
            } else if (choice == 3) {
                return;
            } else {
                System.out.println("Wrong choice!");
            }
        }
    }
}