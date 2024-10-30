package io.codeforall.bootcamp;

class Bank {
    private String bankName;
    private double balance;

    // constructor
    public Bank(String bankName, double balance){
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName(){
        return this.bankName;
    }

    public double getBalance(){
        return this.balance;
    }

    public double addToBalance(double value){
        return balance += value;
    }

    public double deductFromBalance(double value){
        return balance -= value;
    }
}





