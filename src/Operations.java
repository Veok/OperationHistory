/**
 * Created by L on 13.03.2016.
 */
public class Operations {

    private double balance;

    public Operations(double initialBalance){
        if(initialBalance>=0.0)
            balance=initialBalance;
    }

    public double income  (double amount){balance = balance + amount;
    return amount;}

    public double withdraw(double amount){
        balance = balance - amount;
        return -amount;
    }

    public double getBalance(){
        return balance;
    }
}
