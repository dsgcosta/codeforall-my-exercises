package io.codeforall.bootcamp;

public class Sandbox {
    public static void main(String[] args) {
        Person person1 = new Person("Bruno", "Banco CTT", 1.25);
        System.out.println("Person name: " + person1.getPersonName() + " bank account " + person1.getPersonBankName() + " with balance of " + person1.getBalance());
        person1.addToBalance(2.00);
        System.out.println(person1.getBalance());
        person1.deductFromBalance(0.25);
        System.out.println(person1.getBalance());
    }
}
