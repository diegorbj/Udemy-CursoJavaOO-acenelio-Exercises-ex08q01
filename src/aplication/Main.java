package aplication;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Room[] rooms = new Room[10];

        System.out.print("How many rooms wil be rented? ");
        int rents = sc.nextInt();
        sc.nextLine();

        String name;
        String email;
        int number;

        for (int i = 0; i < rents; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            number = sc.nextInt();
            sc.nextLine();

            rooms[number - 1] = new Room(number, name, email);
        }

        for (Room r : rooms) {
            if (r != null) {
                System.out.println(r.getNumber() + ": " + r);
            }
        }

        sc.close();
    }
}
