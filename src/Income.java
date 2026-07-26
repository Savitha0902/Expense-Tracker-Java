public class Income extends Transaction {
    private String incometype;
    Income(int id, double amount, String date, String description, String incometype){
        super(id,amount,date,description);
        this.incometype=incometype;
    }
    public String getIncometype(){
        return incometype;
    }
}
