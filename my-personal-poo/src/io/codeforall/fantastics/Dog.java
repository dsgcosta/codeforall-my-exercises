package io.codeforall.fantastics;

public class Dog extends Animal {
    private boolean isCute;


    public Dog(String animalType){
        super(animalType);
    }

    public boolean getIsCute() {
        return this.isCute;
    }

    public void setIsCute(boolean asleep) {
        isCute = true;
    }

}
