package org.example;

public class Main {
    public static void main(String[] args) {
        Dogs firstDog = new Dogs();
        firstDog.name = "Mikey";
        System.out.println("Dog: ");
        firstDog.animalMoves();
        
        Cats firstCat = new Cats();
        firstCat.color = "Red";
        System.out.println("Cat: ");
        firstCat.animalMoves();
    }
}