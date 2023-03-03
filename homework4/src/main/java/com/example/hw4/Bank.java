package com.example.hw4;

public class Bank {
    private int coins20;
    private int coins50;
    private int coins100;
    private int allMoney;

    public Bank (int coins20, int coins50, int coins100) {
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
        this.allMoney = allMoney;
    }
    public void addMoney (int coins20, int coins50, int coins100, int addCoins20, int addCoins50, int addCoins100) {
        coins20 += addCoins20;
        coins50 += addCoins50;
        coins100 += addCoins100;
        int allAddCoins = addCoins20*20 + addCoins50*50 + addCoins100*100;
        int allMoney = coins20*20 + coins50*50 + coins100*100;
        System.out.println(" Added money = " + allAddCoins);
        System.out.println( " All money on account = " + allMoney);
    }
    public void askMoney (int allMoney) {
        if (allMoney %10 !=0) {
            System.out.println("Wrong sum, try again");
        }
        boolean money;
        if (allMoney > (coins20*20 + coins50*50 + coins100*100)) {
            money = false;
            System.out.println("Insufficient funds on the account");
        }
        else {
            money = true;
            System.out.println(" Receive your money " + allMoney);
        }

        int nom50 = allMoney /100;
        int nom20 = allMoney/50;
        int nom10 = allMoney/20;
        System.out.println( " Amount of 50 = " + nom50 + " Amount of 20 = " + nom20 + " Amount of 10 = " + nom10);
    }

}
