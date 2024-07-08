package Multithreading.Synchronisation.SyncExercise;

public class Customer extends Thread{

    String name;
    int amount;
    AtmMachine atm;

    Customer(String n, AtmMachine a, int amt)
    {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run()
    {
        useATM();
    }
}
