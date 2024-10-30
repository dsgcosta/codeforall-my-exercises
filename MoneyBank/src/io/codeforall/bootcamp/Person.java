package io.codeforall.bootcamp;

public class Person {
    private String personName;
    private Bank bank;

    public Person(String personName, String bankName, double balance){
         this.personName = personName;
         this.bank = new Bank(bankName, balance);
    }

    public String getPersonName(){
        return this.personName;
    }
    public String getPersonBankName(){
        return bank.getBankName();
    }

    public double getBalance(){
        return bank.getBalance();
    }

    public double addToBalance(double value){
          return bank.addToBalance(value);
    }

    // method that invoke another method
    public double deductFromBalance(double value){
        return bank.deductFromBalance(value);
    }
  }










