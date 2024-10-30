package io.codeforall.fantastics;

public class Main {
    public static void main(String[] args) {
        Animal firstAnimal = new Animal("cat");
        System.out.println(firstAnimal.getAnimalType() + firstAnimal.getIfIsAsleep());

        firstAnimal.setAsleep(false);

        Animal secondAnimal = new Animal("dog");

        Dog firstDog = new Dog("Dog");

        Animal dog = new Dog("Snoopy");
        dog.setAsleep(false);
        System.out.println(dog.getIfIsAsleep());

        //secondAnimal.doSomethingToDog();

        //
        // System.out.println(firstDog.getIsCute());
         // when creating a method
        // 1. create an object
        // 2. define return

    }
}
