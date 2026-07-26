public class Transaction {
    private int id;
    private double amount;
    private String date;
    private String description;
    Transaction(int id,double amount,String date,String description){
        this.id=id;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
    public int getId(){
        return id;
    }
    public double getAmount(){
        return amount;
    }
    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public String toString() {
        return "-----------------------------\n" +
                "ID          : " + id + "\n" +
                "Amount      : " + amount + "\n" +
                "Date        : " + date + "\n" +
                "Description : " + description + "\n" +
                "-----------------------------";
    }

}
