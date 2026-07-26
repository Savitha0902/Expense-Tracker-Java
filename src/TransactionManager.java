import java.util.ArrayList;
public class TransactionManager {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    public boolean idExists(int id){

        for(Transaction transaction : transactions){

            if(transaction.getId() == id){
                return true;
            }

        }

        return false;
    }
    public void viewtransaction(){
        for(Transaction transaction:transactions){
            System.out.println(transaction);
        }
    }
    public double getBalance(){
        double balance=0;
        for(Transaction transaction:transactions){
            if(transaction instanceof Income){
                balance+=transaction.getAmount();
            }
            else{
                balance-=transaction.getAmount();
            }
        }
        return balance;
    }
    public double getTotalIncome(){
        double Totalincome=0;
        for(Transaction transaction:transactions){
            if(transaction instanceof Income){
                Totalincome+=transaction.getAmount();
            }
        }
        return Totalincome;

    }
    public double getTotalExpense(){
        double Totalexpense=0;
        for(Transaction transaction:transactions){
            if(transaction instanceof Expense){
                Totalexpense+=transaction.getAmount();
            }
        }
        return Totalexpense;
    }
    public void deleteTransaction(int id){
        for(int i = 0; i < transactions.size(); i++){
            if(transactions.get(i).getId() == id){
                transactions.remove(i);
                System.out.println("Transaction deleted successfully");
                return;
            }
        }
        System.out.println("Transaction not found");
    }
    public void searchTransaction(int id){
        for(Transaction transaction : transactions){
            if(transaction.getId() == id){

                System.out.println("Transaction Found:");
                System.out.println(transaction);
                return;
            }
        }
        System.out.println("Transaction not found");

    }
}
