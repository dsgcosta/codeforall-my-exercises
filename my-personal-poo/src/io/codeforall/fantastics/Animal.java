package io.codeforall.fantastics;

public class Animal {
    private String animalType;
    private boolean isAsleep = true;

    public Animal(String animalType){
        this.animalType = animalType;
        //this.dog = dog;
        //this.isAsleep = true;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean getIfIsAsleep() {
        return isAsleep;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }

    /*
    public void doSomethingToDog(){
        dog.setIsCute(true);
    }

     */
}
