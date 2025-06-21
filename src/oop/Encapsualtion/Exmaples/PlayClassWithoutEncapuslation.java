package oop.Encapsualtion.Exmaples;

public class PlayClassWithoutEncapuslation {
    //public String name;
    public int health;
    public String weapon;
    // Change in Player class
    public String fullName; // Changed from 'name'


    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to full health");
            health = 100;
        }
    }

    public int healthRemaining() {
        return health;
    }

public class Main {
    public void main(String[] args) {
        PlayClassWithoutEncapuslation playClassWithoutEncapuslation = new PlayClassWithoutEncapuslation();
        // player.name = "Tim";
        playClassWithoutEncapuslation.health = 20;
        playClassWithoutEncapuslation.weapon = "sword";

        int damage = 10;
        playClassWithoutEncapuslation.loseHealth(damage);
        System.out.println("Remaining health: " + playClassWithoutEncapuslation.healthRemaining());

        // PROBLEM: Direct field access bypasses validation
        playClassWithoutEncapuslation.health = 200; // Violates max health rule of 100!

        playClassWithoutEncapuslation.loseHealth(11);
        System.out.println("Remaining health: " + playClassWithoutEncapuslation.healthRemaining());


        // Breaks existing code in main method
        //  player.name = "Tim"; // Compilation error!


    }

}}