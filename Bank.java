public class Bank {
    private String[] tellers;
    private Queue_ waitingQueue;
    public Bank(){
        //creating array for 3 tellers
        tellers = new String[3];
        //setting all tellers to null
        for(int i = 0; i < tellers.length; i++){
            tellers[i] = null;
        }
        //creating waiting queue
        waitingQueue = new Queue_();
    }
    public void arrive(String customerName){
        //displaying customer arrival
        System.out.println("Customer " + customerName + " arrived.");
        //checking customer available teller
        for (int i = 0; i < tellers.length; i++){
            if(tellers[i] == null){
                //asigning customer to teller
                tellers[i] = customerName;
                System.out.println(customerName + " is assigned to Teller " + (i + 1) + ".");
                return;
            }
        }
        //adding customer to waiting queue
        System.out.println("All tellers are busy.");
        waitingQueue.enqueue(customerName);
        System.out.println(customerName + " joins the waiting queue.");
    }
    public void completeTransaction(int tellerNumber){
        //checking teller number
        if(tellerNumber < 1 || tellerNumber > 3){
            System.out.println("Invalid teller number!");
            return;
        }
        int index = tellerNumber - 1;
        //checking if teller is available
        if(tellers[index] == null){
        System.out.println("Teller " + tellerNumber + "is already available.");
        return;
        }
        //displaying completed transaction
        System.out.println("Teller " + tellerNumber + " completed " + tellers[index] + "'s transaction");
        //making teller available
        tellers[index] = null;
        //assigning next customer
        assignNextCustomer(tellerNumber);
    }
    public void assignNextCustomer(int tellerNumber){
        //cheking waiting queue
        if(!waitingQueue.isEmpty()){
            //removing first customer
            String nextCustomer = waitingQueue.dequeue();
            //assigning customer to teller
            tellers[tellerNumber - 1] = nextCustomer;
            System.out.println(nextCustomer + " is assigned to Teller " + tellerNumber + ".");
        }
    }
    public void displayStatus(){
        System.out.println("\n---------- BANK STATUS ----------");
        //displaying all tellers
        for(int i = 0; i < tellers.length; i++){
            System.out.println("Teller " + (i + 1) + ": ");
            if(tellers[i] == null){
                System.out.println("Available");
            } else {
                System.out.println(tellers[i]);
            }
        }
        //displaying waiting queue
        System.out.print("Waiting queue: ");
        waitingQueue.display();
        System.out.println("-----------------------------------");
    }
}
