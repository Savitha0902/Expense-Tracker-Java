import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        TransactionManager manager=new TransactionManager();
        while(true){
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View All Transactions");
            System.out.println("4. Delete Transaction");
            System.out.println("5. Search Transaction");
            System.out.println("6. Show Balance");
            System.out.println("7. Show Total Income");
            System.out.println("8. Show Total Expense");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            int choice=rs.nextInt();
            switch(choice){
                case 1: {
                    System.out.println("----- Add Income -----");
                    System.out.println("Enter ID:");
                    int id = rs.nextInt();
                    System.out.print("Enter Amount: ");
                    double amount = rs.nextDouble();
                    rs.nextLine();
                    LocalDateTime now = LocalDateTime.now();

                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String date = now.format(format);

                    System.out.print("Enter Description: ");
                    String description = rs.nextLine();
                    System.out.print("Enter Income Type: ");
                    String incomeType = rs.nextLine();
                    if(manager.idExists(id)){
                        System.out.println("ID already exists. Use another ID.");
                    }
                    else{
                        Income income = new Income(id, amount, date, description, incomeType);
                        manager.addTransaction(income);
                    }
                    break;
                }



                case 2: {
                    System.out.println("----- Add Expense -----");

                    System.out.print("Enter ID: ");
                    int id = rs.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = rs.nextDouble();

                    rs.nextLine();
                    LocalDateTime now = LocalDateTime.now();

                    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String date = now.format(format);

                    System.out.print("Enter Description: ");
                    String description = rs.nextLine();


                    System.out.print("Enter Category: ");
                    String category = rs.nextLine();
                    if(manager.idExists(id)){
                        System.out.println("ID already exists. Use another ID.");
                    }
                    else{
                        Expense expense = new Expense(id, amount, date, description, category);
                        manager.addTransaction(expense);
                    }

                    break;
                }
                case 3:{
                    manager.viewtransaction();
                    break;
                }
                case 4:{
                    System.out.print("Enter Transaction ID to delete: ");
                    int id = rs.nextInt();

                    manager.deleteTransaction(id);

                    break;
                }
                case 5: {
                    System.out.println("Enter Transaction ID to search:");
                    int id=rs.nextInt();
                    manager.searchTransaction(id);
                }
                case 6: {
                    double balance = manager.getBalance();
                    System.out.println("Current Balance: " + balance);
                    break;
                }
                case 7:{
                    double Totalincome=manager.getTotalIncome();
                    System.out.println("Total Income:" +Totalincome);
                    break;
                }
                case 8:{
                    double Totalexpense=manager.getTotalExpense();
                    System.out.println("Total Expense:" +Totalexpense);
                    break;
                }
                case 9:{
                    System.out.println("Thank you for using Expense Tracker!");
                    rs.close();
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}