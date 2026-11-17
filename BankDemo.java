public class BankDemo {
    public static void main(String[] args){
        //creating bank object
        Bank bank = new Bank();
        //adding customer
        bank.arrive("Ali");
        bank.arrive("Ayse");
        bank.arrive("Mehmet");
        bank.arrive("Zeynep");
        bank.arrive("Can");
        //displaying bank status
        bank.displayStatus();
        //completing teller 2 transaction
        bank.completeTransaction(2);
        //displaying updated status
        bank.displayStatus();
        //completing teller 1 transaction
        bank.completeTransaction(1);
        //displaying final status
        bank.displayStatus();
    }
}
