package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Icinde userler haqqinda melumati saxlayan list yaradiriq
        List<User> users = new ArrayList<>();

        // Daxil olanadək baş verən proseslər
        while(true) {
            System.out.println();
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Show all users");
            // 3.show all usernames - adlari cap edecek users listini dovr edib tostring cap edessen
            System.out.println("4.Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            //  Eger register secilse
            if(choice == 1) {
                // Secimleri cap edir
                System.out.println();
                System.out.print("Type your new login:");
                String login = sc.nextLine();
                System.out.print("Type your new password:");
                String password = sc.nextLine();
                System.out.print("Type your name:");
                String name = sc.nextLine();
                System.out.print("Type your lastname:");
                String lastname = sc.nextLine();
                System.out.print("Type your age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Type your starting balance:");
                double amount = sc.nextDouble();
                sc.nextLine();

                // Eyni loginli diger userin olub-olmamasini yoxlayir
                boolean isCopy = false;

                // Butun userler olan listi dovr edir ve her bir useri yoxlayir
                for(int i = 0; i < users.size(); i++){
                    if (users.get(i).getLogin().equals(login)) {
                        // Eger eyni login tapilsa isCopy = true olur
                        isCopy = true;
                        System.out.println("User " + login + " already exists");
                    }
                }

                // isCopy false olarsa yeni !isCopy true qaytararsa
                if(!isCopy) users.add(new User(login, password, name, lastname, age, amount));
            }

            //Eger login secilse
            else if (choice == 2) {
                //Secimleri cap edir
                System.out.println();
                System.out.print("Type your login: ");
                String login = sc.nextLine();
                System.out.print("Type your password: ");
                String password = sc.nextLine();

                // dovr edir ve login ve passwordu  yoxlayir
                for (int i = 0; i < users.size(); i++) {

                    if (users.get(i).getLogin().equals(login) &&
                        users.get(i).getPassword().equals(password)) {

                        // Daxil olandan sonra baş verən proseslər
                        while (true) {
                            System.out.println();
                            System.out.println("1.Show balance");
                            System.out.println("2.Withdraw");
                            System.out.println("3.Add money");
                            System.out.println("4.Show details");
                            System.out.println("5.Return to main menu");


                            System.out.print("Choice: ");
                            int choice2 = sc.nextInt();
                            sc.nextLine();

                            //Eger balansi gormek isdeyirikse 1 i secir
                            if (choice2 == 1) {
                                //cap edir
                                System.out.println();
                                System.out.println("Your balance is: " + users.get(i).showMoneyAmount() + "$");
                            }

                            //pulun cixarilmasi
                            else if (choice2 == 2 ) {
                                System.out.println("Type amount of money to withdraw: ");
                                double newMoney = users.get(i).withdrawMoney(sc.nextDouble());
                                sc.nextLine();
                                System.out.println("New balance: " + newMoney + "$");
                                System.out.println();
                            }

                            //balansa pulun eleave edilmesi
                            else if (choice2 == 3) {
                                System.out.println("Type amount of money to add: ");
                                double amount = sc.nextDouble();
                                sc.nextLine();
                                users.get(i).addMoney(amount);
                                System.out.println("New balance: " + users.get(i).showMoneyAmount() + "$");
                                System.out.println();
                            }

                            //Userin butun detallarini gosderilmesi
                            else if (choice2 == 4) {
                                System.out.println();
                                //Obyekti cagiranda avtomatik obyekt.toString metodu cagirilir
                                System.out.println(users.get(i));
                            }

                            //Eger 5 secilse
                            else if (choice2 == 5) {
                                i = users.size();
                                break;
                            }

                            //Eger hecne secilmese
                            else {
                                System.out.println("Wrong choice");
                            }
                        }
                    }

                    //melumatlar sehvdii
                    else {
                        System.out.println("Wrong credentials");
                    }
                }
            }

            // 3 olanda
            else if (choice == 3) {
                for(int i = 0; i < users.size(); i++){
                    System.out.println(String.valueOf(i+1) + ". " + users.get(i));
                }
            }

            // 4 olandada return yeni qayitsinn
            else if (choice == 4){
                return;
            }

            //secim sehvdi
            else {
                System.out.println("Wrong choice");
            }
        }
    }
}