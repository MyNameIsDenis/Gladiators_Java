package org.example;

import org.example.Gladiators.Dimachaerus;
import org.example.Gladiators.Gallus;
import org.example.Gladiators.Sagittarius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String[] monsters = {"wolf", "goblin", "ogr", "bear", "boar", "dark elf", "alien"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gladiators: ");
        System.out.println(" 1. Gallus\n 2. Sagittarius\n 3. Dimachaerus");
        System.out.print("Choose gladiator: ");
        Gladiator_Stats gladiator = null;
        int choice = scanner.nextInt();
        switch (choice){
           case 1 -> {
              gladiator = new Gallus(5, 2, 0, 1, 1, 3, 10, 30, 3, true);
               System.out.println("You choose gladiator 'Gallus'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 5) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 2));
           }
           case 2 -> {
               gladiator = new Sagittarius(2, 2, 0, 5, 1, 8, 20, 30, 2, false);
               System.out.println("You choose gladiator 'Sagittarius'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 2) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 2));
           }

            case 3 -> {
                gladiator = new Dimachaerus(2, 5, 0, 2, 1, 14, 15, 30, 1, false);
                System.out.println("You choose gladiator 'Dimachaerus'. You have " + (gladiator.getBasicHP() + gladiator.getConstitution() * 2) + "hp and max attack " + (gladiator.getBasicAttack() + gladiator.getStrength() * 5));
            }
        }
        while (true) {
            System.out.println("1. Travel");
            System.out.println("2. Show attributes");
            System.out.println("3. Save game and exit");
            System.out.print("Choose what to do: ");
            int actionChoice = scanner.nextInt();
            switch (actionChoice) {
                case 1 -> {
                    travel(gladiator);
                }
                case 2 -> {
                }
                case 3 -> {

                }

            }
        }

    }
    public static void travel(Gladiator_Stats gladiator) {
        Monster monster = new Monster(
                randNumber(40, 100 * gladiator.getLevel()),
                randNumber(10, 50 + gladiator.getLevel()),
                monsters[randNumber(0, monsters.length)]
        );
        System.out.printf("You meet: %s, attack: %d, hp: %d \n", monster.getName(), monster.getAttack(), monster.getHp());
        System.out.println("1. Fight");
        System.out.println("2. Placate");
        System.out.println("3. Negotiate");
        System.out.println("4. Run away");
        System.out.print("Choose what to do: ");
        Scanner scanner = new Scanner(System.in);
        int gameProcess = scanner.nextInt();

        switch (gameProcess) {
            case 1 -> {
                System.out.println("Fight");
            }
            case 2 -> {
                System.out.println("Placate");
            }
            case 3 -> {
                System.out.println("Negotiate");
            }
            case 4 -> {
                System.out.println("Run away");
            }
        }
    }
    public static int randNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }


}