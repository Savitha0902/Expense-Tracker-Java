public class Expense extends Transaction{
    private String category;
    public Expense(int id, double amount, String date, String description,String category){
        super(id,amount,date,description);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }
}
