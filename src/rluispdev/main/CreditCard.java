package rluispdev.main;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Buy> buys;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.buys = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }
    public double getBalance() {
        return balance;
    }
    public List<Buy> getBuys() {
        return buys;
    }
}

