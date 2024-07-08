package Multithreading.Synchronisation.SyncExercise;

public class ATM_Model {
    public static void main(String[] args) {

        AtmMachine atm = new AtmMachine();

        Customer c1 = new Customer("Harsh",atm, 10000);
        Customer c2 = new Customer("Mukul", atm, 20000);

        c1.start();
        c2.start();
    }
}
