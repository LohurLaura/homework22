package org.example;

public class Main {
    public static void main(String[] args) {
        Dogs firstDog = new Dogs();
        System.out.println("Dog: ");
        firstDog.animalMoves();
        
        Cats firstCat = new Cats();
        System.out.println("Cat: ");
        firstCat.animalMoves();
    }
}