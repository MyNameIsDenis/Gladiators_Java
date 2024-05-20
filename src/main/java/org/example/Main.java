package org.example;

import org.example.Gladiators.Dimachaerus;
import org.example.Gladiators.Gallus;
import org.example.Gladiators.Sagittarius;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] monsters = {"wolf", "goblin", "ogr", "bear", "boar", "dark elf", "alien"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gladiators: ");
        System.out.println(" 1. Gallus\n 2. Sagittarius\n 3. Dimachaerus");
        System.out.print("Choose gladiator: ");
        int choice = scanner.nextInt();
        switch (choice){
           case 1 -> {
               Gallus gallus = new Gallus(5, 2, 0, 1, 0, 3, 10, 30, 3, true);
               System.out.println("You choose gladiator 'Gallus'. You have " + (gallus.getBasicHP() + gallus.getConstitution() * 5) + "hp and max attack " + (gallus.getBasicAttack() + gallus.getStrength() * 2));
           }
           case 2 -> {
               Sagittarius sagittarius = new Sagittarius(2, 2, 0, 5, 0, 8, 20, 30, 2, false);
               System.out.println("You choose gladiator 'Sagittarius'. You have " + (sagittarius.getBasicHP() + sagittarius.getConstitution() * 2) + "hp and max attack " + (sagittarius.getBasicAttack() + sagittarius.getStrength() * 2));
           }

            case 3 -> {
                Dimachaerus dimachaerus = new Dimachaerus(2, 5, 0, 2, 0, 14, 15, 30, 1, false);
                System.out.println("You choose gladiator 'Dimachaerus'. You have " + (dimachaerus.getBasicHP() + dimachaerus.getConstitution() * 2) + "hp and max attack " + (dimachaerus.getBasicAttack() + dimachaerus.getStrength() * 5));
            }
        }
    }

}